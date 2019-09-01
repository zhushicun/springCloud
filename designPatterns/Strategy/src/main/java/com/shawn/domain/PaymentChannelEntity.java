package com.shawn.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "paymentchannel")
@Data
@ToString
@NoArgsConstructor
public class PaymentChannelEntity {
   /** ID */
   @Id
   @GeneratedValue(strategy= GenerationType.IDENTITY)
   private Integer id;
   /** 渠道名称 */
   @Column(name = "channel_name")
   private String channelName;
   /** 渠道ID */
   @Column(name = "channel_id")
   private String channelId;
   /**
    * 策略执行beanId
    */
   @Column(name = "strategy_bean_id")
   private String strategyBeanId;

}
