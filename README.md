# initial setup
check scala version

    <scala.version>2.11.5</scala.version>
    <scala.compat.version>2.11</scala.compat.version>

it's 2.11

in eclipse project property, setup scala version same as 2.11

add junitrunner dependency

    </dependency>
        <dependency>
        <groupId>org.specs2</groupId>
        <artifactId>specs2-junit_${scala.compat.version}</artifactId>
        <version>3.8.9</version>
        <scope>test</scope>
    </dependency>
    
add README.md for this.

Done.
