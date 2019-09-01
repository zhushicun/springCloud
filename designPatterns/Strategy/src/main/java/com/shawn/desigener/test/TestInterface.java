package com.shawn.desigener.test;

import com.alibaba.druid.VERSION;
import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.*;
import org.apache.lucene.index.*;
import org.apache.lucene.queryparser.classic.MultiFieldQueryParser;
import org.apache.lucene.search.*;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;
import org.apache.lucene.util.Version;
import org.wltea.analyzer.lucene.IKAnalyzer;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TestInterface {
    private IndexWriter writer; // 写索引实例

    public static void main(String[] args) throws Exception{
        /*Test test = new TestPojo();
        TestPojo testPojo = new TestPojo();
        testPojo.C();*/
        /*TestInterface testInterface = new TestInterface();
        IndexWriter indexWriterInstance = getIndexWriterInstance("D:\\lucene");
        List<Document> document = createDocument();
        for (Document d:
                document) {
            indexWriterInstance.addDocument(d);
            indexWriterInstance.commit();
        }

        indexWriterInstance.close();*/
        //查询
        Directory fsDirectory = FSDirectory.open(Paths.get("D:\\lucene"));
        IndexReader indexReader= DirectoryReader.open(fsDirectory);
        IndexSearcher searcher =new IndexSearcher(indexReader);
        Query query= new TermQuery(new Term("task_title","少年"));
        //Query query= new FuzzyQuery(new Term("task_title","太阳"));
        Analyzer ikAnalyzer = new StandardAnalyzer();
       // Query query= MultiFieldQueryParser.parse(new String[]{"task_title"},new String[]{"太阳"},ikAnalyzer);
        TopDocs search = searcher.search(query, 10);
        System.out.println(search.totalHits);
        indexReader.close();
    }

    public void Index(String indexDir)throws Exception{
        Directory dir=FSDirectory.open(Paths.get(indexDir));
        Analyzer analyzer=new StandardAnalyzer(); // 标准分词器
        IndexWriterConfig iwc=new IndexWriterConfig(analyzer);
        writer=new IndexWriter(dir, iwc);
    }

    /**索架索引*/
    public static List<Document> createDocument(){
        /*
            0.Field.Store.NO 查询出document时,通过document.get(key)无法获取值，设置为NO时只能进行索引查询
            1.使用new TextField("字段名称","字段值")，采用TextField会将其字段值进行分词;
                new TextField("name" ,"张三", Field.Store.NO)
               如果不需要分词的字符串可以采用 new StringField(key,value)形式,如果不分词对于value字段值有长度限制，超出则报异常
            2. NumericDocValuesField：数值型,不会进行分词
               document.add(new NumericDocValuesField("mynumber", 1234));
               //相当于Field.Store.YES
               document.add(new StoredField("mynumber", 1234));
            3.
         */
        List<Document> list = new ArrayList<Document>();
        Document document = new Document();
        document.add(new TextField("name" ,"张三", Field.Store.NO));
        document.add(new NumericDocValuesField("id", 145));
        document.add(new StoredField("id_NO", 456));
        document.add(new TextField("task_title", "冷太阳少年浪银监管",Field.Store.YES));
        document.add(new TextField("task_detail", "冷太阳少年浪银监管",Field.Store.YES));
        list.add(document);
        Document document1 = new Document();
        document1.add(new TextField("name" ,"张三", Field.Store.NO));
        document1.add(new NumericDocValuesField("id", 4534));
        document1.add(new StoredField("id_NO", 789));
        document1.add(new TextField("task_title", "冷太二少年浪银监管",Field.Store.YES));
        document1.add(new TextField("task_detail", "冷太二少年浪银监管",Field.Store.YES));
        list.add(document1);
        Document document2 = new Document();
        document2.add(new TextField("name" ,"张三", Field.Store.NO));
        document2.add(new NumericDocValuesField("id", 424));
        document2.add(new StoredField("id_NO", 7856));
        document2.add(new TextField("task_title", "冷太一少年浪银监管",Field.Store.YES));
        document2.add(new TextField("task_detail", "冷太一少年浪银监管",Field.Store.YES));
        list.add(document2);
        Document document3 = new Document();
        document3.add(new TextField("name" ,"张三", Field.Store.NO));
        document3.add(new NumericDocValuesField("id", 145));
        document3.add(new StoredField("id_NO", 456));
        document3.add(new TextField("task_title", "太阳少年",Field.Store.YES));
        document3.add(new TextField("task_detail", "冷太阳少年浪银监管",Field.Store.YES));
        list.add(document3);
        return list;
    }

    /**
     * @param dir 存放索引文件的 文件存放路径
     * @return
     */
    public static IndexWriter getIndexWriterInstance(String dir) {
        File file = new File(dir);
        if (!file.exists()) {
            file.mkdirs();
        }
        try{
            Directory directory = FSDirectory.open(Paths.get(dir));
            Analyzer ikAnalyzer = new StandardAnalyzer();
            //设置相应的分词器
            IndexWriterConfig indexWriterConfig = new IndexWriterConfig(ikAnalyzer);
            return new IndexWriter(directory, indexWriterConfig);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
