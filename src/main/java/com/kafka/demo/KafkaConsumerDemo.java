//package com.kafka.demo;
//
//import org.apache.demo.clients.consumer.ConsumerConfig;
//import org.apache.demo.clients.consumer.ConsumerRecord;
//import org.apache.demo.clients.consumer.ConsumerRecords;
//import org.apache.demo.clients.consumer.KafkaConsumer;
//import org.apache.demo.common.serialization.StringDeserializer;
//
//public class KafkaConsumerDemo {
//
//    private final static String TOPIC_NAME = "my-repllicated-topic";
//    private final static String CONSUMER_GROUP_NAME = "testGroup";
//
//    public static void main(String[] args) {
//
//        PropertiesDemo props = new PropertiesDemo();
//        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "0.0.0.0:00,0.0.0.0:00,0.0.0.0:00");
//        // 消费分组名
//        props.put(ConsumerConfig.GROUP_ID_CONFIG, CONSUMER_GROUP_NAME);
//        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
//        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
//        // 创建一个消费者的客户端
//        KafkaConsumer<String, String> consumer = new KafkaConsumer<String, String>(props);
//        // 消费者订阅主题列表
//        consumer.subscribe(Arrays.asList(TOPIC_NAME));
//        while (true){
//            /**
//             * poll() API 是拉取消息的长轮询
//             */
//            ConsumerRecords<String, String> records = consumer.poll(Duration.ofMillis(1000));
//            for (ConsumerRecord<String, String> record : records){
//                System.out.printf("收到消息：partition = %d,offset = %d, key = %s, value = %s%n", record.partition(),record.offset(),record.key(), record.value());
//            }
//        }
//
//    }
//
//}
