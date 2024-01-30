-- in mySQL --

CREATE SCHEMA word_exersice;

CREATE TABLE word_pairs (
id INT AUTO_INCREMENT,
eng varchar(255),
hun varchar(255),
PRIMARY KEY (id)
);


INSERT INTO word_pairs (id, eng, hun)
VALUES(0, '', ''),
	(0, '', ''),
	(0, '', '');

SELECT * FROM word_pairs;

-- in pom --
(for executable .jar)
<build>
  <plugins>
    <plugin>
      <!-- Build an executable JAR -->
      <groupId>org.apache.maven.plugins</groupId>
      <artifactId>maven-jar-plugin</artifactId>
      <version>3.1.0</version>
      <configuration>
        <archive>
          <manifest>
            <addClasspath>true</addClasspath>
            <classpathPrefix>lib/</classpathPrefix>
            <mainClass>com.mypackage.MyClass</mainClass>
          </manifest>
        </archive>
      </configuration>
    </plugin>
  </plugins>
</build>
