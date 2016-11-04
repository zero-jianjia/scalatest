package com.zero

import java.io.StringWriter

import com.fasterxml.jackson.databind.{DeserializationFeature, ObjectMapper, SerializationFeature}
import com.fasterxml.jackson.module.scala.DefaultScalaModule
import com.fasterxml.jackson.module.scala.experimental.ScalaObjectMapper
import org.springframework.context.annotation.Bean

/**
  * Created by jianjia on 16/02/20.
  */
object JacksonUtil {
    val mapper = {
        val a = new ObjectMapper() with ScalaObjectMapper
        a.registerModule(DefaultScalaModule)
        a.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
        a.enableDefaultTyping()
        a
    }
    private[this] val strict_objectMapper: ObjectMapper = new ObjectMapper()
    private[this] val nonStrict_objectMapper: ObjectMapper = new ObjectMapper()
        .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
    
    /**
      * json字符串转Object,严格要求json字段与Object字段一一对应
      */
    @throws(classOf[Exception])
    def jsonStr2ObjectStrict[T](jsonStr: String, cls: Class[T]): T = {
        strict_objectMapper.readValue(jsonStr, cls)
    }
    
    /**
      * json字符串转Object,非严格要求json字段与Object字段一一对应
      */
    @throws(classOf[Exception])
    def jsonStr2ObjectNonStrict[T](jsonStr: String, cls: Class[T]): T = {
        nonStrict_objectMapper.readValue(jsonStr, cls);
    }
    
    def jsonStr2Object[T: Manifest](jsonStr: String): T = {
        mapper.readValue[T](jsonStr)
    }
    
    /**
      * 将object转json字符串,仅字符串化实现getter的字段
      */
    def object2JsonStr[T](instance: T): String = {
        try {
            strict_objectMapper.writeValueAsString(instance)
        } catch {
            case ex: Exception => null
        }
    }
    case class Person(name: String, age: Int)
    
    def main(args: Array[String]) {
//        case class Stu(@Bean  name: String, @Bean  age: Int)
//        val mapper = new ObjectMapper() with ScalaObjectMapper
//        mapper.registerModule(DefaultScalaModule)
//        
//        val json = """{"a":1}"""
//        val f = mapper.readValue[Map[String, Int]](json)
//        println(f)
//        
//        println(JacksonUtil.object2JsonStr(Stu("zero", 23)))
//        println(JacksonUtil.mapper.writeValueAsString(Stu("zero", 23)))
//        
//        val str = mapper.writeValueAsString(Stu("zero", 23))
//        println(str)
//        
//        val s = mapper.readValue(str, classOf[Stu])
//        println(s)
//        val t = Map("a" ->(3, 4))
//        println(t)
        //     
//        mapper.registerModule(module)
//        val ab = mapper.writeValueAsString(t)
//        
//        println(ab)
//        val abb = mapper.readValue[Map[String,Tuple2[Int,Int]]](ab)
//        println(abb)
//        val person = Person("Fred", 65)
//        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.PASCAL_CASE_TO_CAMEL_CASE)
//        println(object2JsonStr(person))
        
        val person = new Person("fred", 25)
        val mapper = new ObjectMapper() with ScalaObjectMapper
        mapper.registerModule(DefaultScalaModule)
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
        mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS,false)
    
        val out = new StringWriter
        mapper.writeValue(out, person)
        val json = out.toString()
        println(json)
    
        val person2 = mapper.readValue(json, classOf[Person])
        println(person2)
        
        println(mapper.readValue[Person](json))
    }
}
