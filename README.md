# spring-core
## Notes:
* Data types handled by IOC container to inject:
  - Primitive: byte,short,int,long,double,char,float,boolean
    ```
        <bean name="beanName" class="nameOfTheClassWithPackageName[com.example.Person]" >
            <property name="name" value="moshiur" />
            <property name="age" value="26" />
            <property name="isGood" value="true" />
        </bean>
      ```
  - Collection: List,Set,Map,Properties
    ```
    <property name="phoneNumbers">
        <list>
            <value>123454</value>
            <value>123454</value>
            <value>123454</value>
        </list>
    </property>
    
    <property name="courses">
        <set>
            <value>C</value>
            <value>C++</value>
            <value>Java</value>
        </set>
    </property>
    
    <property name="courseInstructors">
        <map>
            <entry key="C" value="Instructor of C" />
            <entry key="C++" value="Instructor of C++" />
            <entry key="Java" value="Instructor of Java" />
        </map>
    </property>
    ```
  - Reference: User defined class objects
    ```
    Student.java:
    public class Student{
      private University university;
    }
    ```
    config.xml file:
    ```
    <bean name="universityBean" class="org.example.University">
      <property name="universityName" value="Oxford University" />
    </bean>
    
    <bean name="student" class="org.example.Student">
      <property name="university" ref="universityBean" />
    </bean>
    ```
    
* Life Cycle of beans called by IOC container
  * set the values
  * call init()
  * perform task
  * call destroy()
* Three ways of calling life cycle methods of beans:
  - xml based approach:
  
    ``` <bean name="beanName" class="org.example.SampleClass" init-method="init" destroy-method="destroy"> ... </bean> ```
  
  - Implementing InitializationBean and DisposableBean interface
    ```
    public class Student implements InitializationBean, DisposableBean{
      @Override
      public void afterPropertiesSet() throws Exception { ... }
      
      @Override
      public void destroy() throws Exception() { ... }
    ```
  - Using ```@PostConstruct```, ```@PreDestroy``` annotation at any method that we want to use as ```init()``` and ```destroy()```. By default, these two               annotations are disabled. To enable these two annotations, we have to use a tag in config.xml file.  
    ``` <bean class="org.springframework.context.annotation.CommonAnnotationBeanPostProcesssor />```
    
* To enable all annotations of our entire project,add ``` <context:annotation-config /> ``` in config.xml file    
  
    
