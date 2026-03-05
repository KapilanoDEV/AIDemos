# AIDemos

I am learning more about AI Engineering. I am enrolled on a course as referenced at the end of this README.
The course is aimed at professionals looking to enhance their skills in AU Engineering. It covers practical, hands-on experience with key concepts and tools used in AI Engineering.


## Code

### Main.java
I want use Java code to communicate with the AI API. I do this by making HTTP calls purely using Java without requiring the OpenAI
library. For some languages like Rust you have to use an HTTPClient as OpenAI have not provided an SDK for those languages. For Java they have so
I will write an HTTP Client program and one using their SDK.


I added the dependency to pom.xml but I am not going to use it for the HTTP Client.

```
<dependencies>
<!--        <dependency>-->
<!--            <groupId>com.openai</groupId>-->
<!--            <artifactId>openai-java</artifactId>-->
<!--            <version>4.0.0</version>-->
<!--        </dependency>-->
</dependencies>
```
Key Parts to Remember:

```
BodyPublishers.ofString(requestBody): This tells Java, "I expect the server to send back text (HTML or JSON). Please convert the raw bytes into a Java String for me."
```

## Citations

https://courses.telusko.com/learn/home/generative-ai-with-java-and-python-co-learn/section/688831/lesson/4400275?