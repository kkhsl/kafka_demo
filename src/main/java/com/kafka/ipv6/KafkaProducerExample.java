package com.kafka.ipv6;

/**
 * @author HKK
 * @version 1.0
 * @date 2024-06-20 14:42
 */
public class KafkaProducerExample {

    public static void main(String[] args) {

    }


//    // 配置Kafka消费者
//    Properties properties = new Properties();
//        properties.put("bootstrap.servers", "localhost:9092"); // Kafka 集群地址
//        properties.put("group.id", "test-group"); // 消费者群组ID
//        properties.put("enable.auto.commit", "true"); // 自动提交offset
//        properties.put("auto.commit.interval.ms", "1000"); // 提交offset的频率
//        properties.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
//        properties.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
//
//    // 创建KafkaConsumer实例
//    KafkaConsumer<String, String> consumer = new KafkaConsumer<>(properties);
//
//    // 订阅主题
//    String topic = "test-topic"; // 需要消费的主题
//        consumer.subscribe(Arrays.asList(topic));
//
//    // 消费消息
//        while (true) {
//        ConsumerRecords<String, String> records = consumer.poll(100);
//        for (ConsumerRecord<String, String> record : records) {
//            System.out.printf("offset = %d, key = %s, value = %s\n", record.offset(), record.key(), record.value());
//        }
//    }
}
