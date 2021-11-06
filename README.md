# SoftwareTest
软件测试代码库
##环境依赖
1. Maven <br>
2. Git<br>
3. JUnit<br>
4. Apache<br>
5. Mockito<br>
##部署步骤
1.从Apache官 网复制Csv和Ma th的依赖，粘贴到pom.xml
2.编写项目代码完成后，将JUni t的依赖写进pom.xml,然后进行单元测试
3.完成单元测试后，将Mockito的依赖写进pom.xm1,对项目进行集成测试
4.完成集成测试后，需要对项目进行持续集成测试，在Jenkins上进行，需要连接到Git仓库,
Help->Insta11 New Software->Add->填写EGit和https://github.com/wangfachang111/SoftwareTesting.git
###目录结构描述
|---Readme . md
|---pom.xml
|---src
|     |---build
|     |      |---java
|     |      |     |---coverageTest  
|     |      |     |        |---MoneyCalculate.java
|     |      |     |---junit_math3_test
|     |      |     |        |---AllTests.java
|     |      |     |        |---Evaluate2Test.java
|     |      |     |        |---EvaluateTest.java
|     |      |     |        |---IncrementTest.java
|     |      |     |---math3_test
|     |      |              |---Main.java
|     |      |---resources
|     |---test
|          |---java
|          |---resources
|---target
###版本内容更新
