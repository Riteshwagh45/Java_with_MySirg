error id: file:///D:/java_with_Saurabh_shukla/Assignments/Assign-Solve/Exception%20Handling/practice.java
file:///D:/java_with_Saurabh_shukla/Assignments/Assign-Solve/Exception%20Handling/practice.java
### com.thoughtworks.qdox.parser.ParseException: syntax error @[26,8]

error in qdox parser
file content:
```java
offset: 757
uri: file:///D:/java_with_Saurabh_shukla/Assignments/Assign-Solve/Exception%20Handling/practice.java
text:
```scala
import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter a two numbers : ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int result = a / b;
            System.out.println("dividation = "+result);
        }

      //  catch(ArithmeticException e ){
          System.out.println(e.getMessage());
       }

        catch(Exception e ){
            System.out.println("Invalid input you have typed :");
        }

       finally{

        System.out.println("Enter a number:");
        int a = sc.nextInt();
        System.out.println("sqaure is = "+a*a);
       }@@
    }
}
```

```



#### Error stacktrace:

```
com.thoughtworks.qdox.parser.impl.Parser.yyerror(Parser.java:2025)
	com.thoughtworks.qdox.parser.impl.Parser.yyparse(Parser.java:2147)
	com.thoughtworks.qdox.parser.impl.Parser.parse(Parser.java:2006)
	com.thoughtworks.qdox.library.SourceLibrary.parse(SourceLibrary.java:232)
	com.thoughtworks.qdox.library.SourceLibrary.parse(SourceLibrary.java:190)
	com.thoughtworks.qdox.library.SourceLibrary.addSource(SourceLibrary.java:94)
	com.thoughtworks.qdox.library.SourceLibrary.addSource(SourceLibrary.java:89)
	com.thoughtworks.qdox.library.SortedClassLibraryBuilder.addSource(SortedClassLibraryBuilder.java:162)
	com.thoughtworks.qdox.JavaProjectBuilder.addSource(JavaProjectBuilder.java:174)
	scala.meta.internal.mtags.JavaMtags.indexRoot(JavaMtags.scala:49)
	scala.meta.internal.metals.SemanticdbDefinition$.foreachWithReturnMtags(SemanticdbDefinition.scala:99)
	scala.meta.internal.metals.Indexer.indexSourceFile(Indexer.scala:560)
	scala.meta.internal.metals.Indexer.$anonfun$reindexWorkspaceSources$3(Indexer.scala:691)
	scala.meta.internal.metals.Indexer.$anonfun$reindexWorkspaceSources$3$adapted(Indexer.scala:688)
	scala.collection.IterableOnceOps.foreach(IterableOnce.scala:630)
	scala.collection.IterableOnceOps.foreach$(IterableOnce.scala:628)
	scala.collection.AbstractIterator.foreach(Iterator.scala:1313)
	scala.meta.internal.metals.Indexer.reindexWorkspaceSources(Indexer.scala:688)
	scala.meta.internal.metals.MetalsLspService.$anonfun$onChange$2(MetalsLspService.scala:940)
	scala.runtime.java8.JFunction0$mcV$sp.apply(JFunction0$mcV$sp.scala:18)
	scala.concurrent.Future$.$anonfun$apply$1(Future.scala:691)
	scala.concurrent.impl.Promise$Transformation.run(Promise.scala:500)
	java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1095)
	java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:619)
	java.base/java.lang.Thread.run(Thread.java:1447)
```
#### Short summary: 

QDox parse error in file:///D:/java_with_Saurabh_shukla/Assignments/Assign-Solve/Exception%20Handling/practice.java