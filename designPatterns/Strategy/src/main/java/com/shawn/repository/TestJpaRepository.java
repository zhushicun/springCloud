package com.shawn.repository;

import com.shawn.domain.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TestJpaRepository extends JpaRepository<Test,Integer> {
    @Modifying
    @Query(value = "update Test a set a.password = '123456',a.username = :guid where a.id=1")
    void updateUserByGuid(@Param("guid") String guid);
}
