---

---

# 				javaEE

## 1.java多态性

### 1.1里氏转换原则：



​	任何基类出现的地方，子类都可以出现

​	由此延伸出来，父类的引用指向子类的对象。由此又可以延伸出来，真正的面向对象

​	①如果一个地方需要一个父类，那么可以使用这个父类的子类来代替

​	②如果一个父类中指向的是子类，那么这个父类可以强制转换为子类

`*代码示范：*

```java
Person per1=new Man();
Man man1=(Man)per1;
```

### 1.2 多态的使用————虚拟方法的使用（向上转型）

​	**有了对象的多态性之后，我们在编译期只能调用父类中声明的方法，但在运行期间我们实际执行的是子类重写父类的方法**

特例：我们的属性，也就是字段无法使用多态性，那么就看属性的调用者是谁，而不是看调用者内部实际指向的类是谁

### 1.3动态绑定和重载解析（方法的重写和重载）

①***动态绑定***：如果要调用的方法依赖于隐式参数的实际类型，那么必须在运行时使用***动态绑定（晚绑定）***

②***重载解构***：编译器要确定方法调用中提供的参数类型，如果在所有名为f的方法中存在一个与所提供的参数类型完全匹配的方法，就选择这个方法，这个过程称之为重载解构  重载解构也被称之为***静态绑定（早绑定）***

### 1.4 instanceof 关键字使用 与（向下转型）

***语法***： student instanceof person  (返回值 boolean) 

***含义***：检验student 是否是类person的对象，返回值为boolean  

***何时为true?***  答：当前对象student 为person类的子类关系，为true,否则false;

***作用：***为父类强制类型转换为子类提供正确与否参考



## 2 java.Lang.Object类详解

### 1.1常用方法解释

#### 1.1.1 Object clone()  创建并返回一个克隆过的对象

#### 1.1.2 equals()  比较两个对象是否相等

 ***==的含义***：==在用做基础类型的值比较的时候，对于基本类型就是比较值，对引用类型就是比较内存地址

equals()属于java.lang.Object类中的方法，如果该方法没有被重写过默认也是==；我们可以看到equals在String 中是被重写过的，而且String 类在日常开发中用的也比较多，久而久之，形成了equals是比较值的错误观点。

equals() 是一个方法，只适用于引用数据类型

```java
public boolean equals(Object obj){
    return (this == obj);
}
```

<u>String类， Date 类, File类 包装类等都重写了equals方法</u>

#### 1.13finalize() GC调用，回收堆中的对象，GC通知类来调finalize

#### 1.14getClass() 返回当前对象所属的类

#### 1.15hashcode() 返回当前对象的hash值

#### 1.16toString() 返回类名和他的引用地址

String Date File 包装类都重写了Object类中的toString() 方法

## 3单元测试

单元测试，测试某一段代码的方式

### 步骤：

1 选择当前工程，右键 Build path  -add libraries  -   JUnit4选择下一步

![1](G:\myUfile\Ufile\java\img\1.png)

2创建java类，进行单元测试，要求此类必须是Public  此类提供公共的无参数的构造器

![2](G:\myUfile\Ufile\java\img\2.png)

3创建单元测试方法， 要求方法必须是Public 返回值必须是void 没有形式参数

![3](G:\myUfile\Ufile\java\img\3.png)

4在单元测试方法上必须添加注解 @Test ,导入 Import org.junit.Test;

![4](G:\myUfile\Ufile\java\img\4.png)

5在方法中添加需要测试的代码，进行测试

## 4包装类

### 4.1基础数据类型和包装类

基础数据——包装类

1. byte ----Byte

2. short----Short

3. int----Integer

4. long----Long

5. float----Float

6. double----Double

7. boolean----Boolean

8. char----Character

### 4.2基础类型转换为包装类

语法：new  包装类（）； 

特殊例子 ：Boolean包装类构造方法对于字符串类型的处理不同

基础类型转换为包装类代码示例：

```java
int n1=1;
Integer inter=new Integer(n1);  //将基础数据类型转换为包装类
System.out.println(inter.toString());//将包装类中的数据转换成为String 
```



### 4.3包装类转换为基础类型

语法：调用包装类的xxxValue() 方法即可

包装类型转换为基础类型代码示例：

```java
Character chars1=new Character('a');
char chars2=chars1.charValue();
System.out.println(chars2);
```

### 4.4自动装箱和自动拆箱（来源于C#语法） 

自动装箱代码示例：

```java
public class ObjectTest {
	 @Test
	 public void wapperTest() {  
		 Order or1=new Order();
		 int n1=1;
		 or1.method(1); //我们的基础数据类型可以在不通过转换的方式直接赋值给我们的Object类型，蕴含了新特性-----自动装箱
	 }
}
class Order {
	void method(Object obj) {
		System.out.println(obj);
	}
}
```

自动拆箱代码示例：

```java
public class ObjectTest {
	 @Test
	 public void wapperTest() { 
		 Order or1=new Order();
		 Integer n1=new Integer(1);
		 or1.method(n1);//结果为1,我们的包装类类型可以自动转换为基础类型，蕴含了新特性-----自动拆箱		 
	 }
}
class Order {
	void method(int n1) {
		System.out.println(n1);
	}
}
```



### 4.5基础数据类型以及包装类和String之间的转换

***使用String类中的静态方法 valueOf() 代码示例：***

```java
Integer n1=new Integer(1);
		System.out.println(String.valueOf(n1));
```

使用包装类中的静态方法parseInt()代码示例：

```java
String str="123";
int result=Integer.parseInt(str);
System.out.println(result);
```

***面试知识点：***

```java
//Integer 内部定义了一个IntegerCache结构，IntegerCache类中定义了Integer[]数组
//保存了-128~127范围的整数，如果我们使用自动装箱的格式给Integer赋值的范围在-128~127范围内时，可以直接使用数组中的元素，不用再去new一个对象
//一旦赋值的整数范围超过了-128~127的范围，那么就会New一个Integer对象
//目的：提高效率
```



## 5 static关键字

#### 1.1含义：静态的

#### 2.1：static用来修饰属性，方法，代码块，内部类

#### 3.1：静态属性：称之为静态变量（属性） ，与之对应的称之为实例变量（属性）——————特点:每一个实例对象都共享这一个静态变量，其他任何对象都可对其修改并影响另外的静态变量，静态变量属于类，实例变量属于实例对象，静态变量存在方法的静态域中。

#### 4.1静态引入: import static 包名下的某个静态变量或方法；



## 6单例模式

```java
//懒汉式单例模式   是不安全的
public class Singletontwo {

	private  static Singletontwo sing = null;
	private Singletontwo() {
		
	}
	public static Singletontwo getSingletontwo() {
		if (sing == null) {
			sing =new Singletontwo();
			return sing;
		}
		else {
			return sing;
		}
	}
}

```



```java

//饿汉式  是一个线程安全的单例模式
public class Singleton {

	private static Singleton sing = new Singleton();
	private Singleton() {
		
	}
	public static Singleton GetSingleton() {
		 

			return sing;	
				
	}
}

```



## 7 代码块  初始化块（初始块）

### 1.1作用：用来初始化类或者对象

### 1.2分类：

静态代码块  vs 非静态代码块

1. 静态代码块随着类的加载而执行

2. 非静态代码块随着对象的创建被执行

1.3类中各个模块加载顺序：

​					隐式加载（默认加载）  > 显示加载/代码块加载（根据情况区分静态代码块和普通代码块）>构造器加载 >调用方法或者调用属性来进行加载     大原则 ：（由父及子，静态先行）

## 8 final关键字

1.1 final可修饰的内容： 类 class field  method

```java
//用final修饰类，类无法被继承
//用final修饰方法，方法无法被重写
//用final修饰字段 &变量， 此时变量成常量，无法被二次修改，属性可以使用显式初始化，代码块中初始化初始化值，构造器中初始化
//final修饰形参 ，形参无法在方法体内二次操作
```





## 9 abstract关键字

原理：当一个父类的子类越来越多，父类需要和子类保持共同特征，导致父类功能越来越少，我们在开发中常常不创建父类对象，于是乎，我们希望有一种类，此类不用来创建对象，完完全全的进行抽象，而类中的具体的方法我们也不知道该如何进行描述，我们将类中的方法也进行全方位抽象，具体实现由子类来完成。从而实现了抽象类和抽象方法

 抽象类无法被实例化，抽象类中不一定有抽象方法，一旦有抽象方法，则必须被子类重写

抽象类拥有构造器，构造器的作用是服务于子类，并且实现匿名对象



## 10模版方法模式 TemplateMethod

原理：当我们实现某个算法功能的时候，整体步骤很通用，这些步骤在父类中已经写好了，但是某些部分十分易变，易变部分可以抽象出来，供不同子类来实现。这就是一种模版模式

```java
abstract class Template{
	public void spendTime() {
		long start =System.currentTimeMillis();
		code();
		long end =System.currentTimeMillis();
		System.out.println("花费的时间为"+(start-end));
	}
	public abstract void code();
}
```



### 1.1匿名子对象 

语法：

```java
Person p =new Person(){
 //   代码块中写出抽象类需要重写的抽象方法，此类为匿名类 也为匿名对象
}  // 只写一次
```



## 11 接口interface    和implement关键字

核心思想：如果你要......，则必须能......



接口中可以定义 

```java
	static final int  n1 =1;//全局常量 书写的时候可以省略不写static final  无法更改
	int  n1 =1; //省略写法
	abstract void Fly();//抽象方法
	void Fly();//省略写法 abstract void Fly();

	static void quictFly() {
    	System.out.println("你好世界");
    }; //静态方法
	
```

### 1.1解释

 接口没有构造器，无法创建接口对象，接口无法实例化 ,子类实现 implements 接口，必须重写接口中的抽象方法

如果一个类实现了一个接口中所有的抽象方法，此实现类就可以实例化

如果一个类未能完全或者没有实现一个接口中的抽象方法，那么此类为抽象类

接口之间可以进行继承，extends  ,并且是多继承

java类可以实现多个接口，弥补了类和类之间只能单继承的缺点

### 1.2匿名实现类

```java
public class InterfaceTest {
	@org.junit.Test
	public void Test() {
	
		new plane() {
		public void Fly() {
			System.out.println("重新写一个匿名的方法来实现这个接口");
		}
		}.Fly();  //匿名实现接口
		System.out.println("飞翔中~~~~");
	}
}

```

### 1.3接口中的静态方法和默认方法 

```java
//1) 接口中的静态方法只能通过接口来调用
//2) 接口中的默认方法可以直接被调用
//3) 当一个类中
```



## 12 代理模式

概念： 一个类内部调用其他类的方法，代理此类，使用技术：接口

静态代理和动态代理   需要使用反射这个技术



## 13工厂模式

实现了创建者和调用者的分离，即将创建对象的具体过程屏蔽隔离起来，达到提高灵活性的目的。

1简单工厂

2 工厂模式

3抽象工厂模式








## 14多线程

### 14.1多线程的创建方式一
1.继承Thread类

2.重写Thread类的run方法

3.创建这个子类的对象

4.通过此对象调用start方法，一个线程中的start方法一次性只能调用一次

#### 14.1.2当我们调用一个继承了thread类的start方法时，

第一：创建一个新的线程

第二：调用当前线程中重写的run方法 

### 14.2匿名子类编写

```java
package threads1.li.xin.ping;
import java.lang.Thread;
public class Test {

//run subject at main thread
    public static void main(String... args){ 
    new Thread(){
        @Override
        public void run(){
            for (int i=0;i<100;i++){
                if (i %2 ==0)
                System.out.println(Thread.currentThread().getName() + "~" + i);
            }
        }
    }.start();


    }


}
```

### 14.3thread常用方法

1. String  getName()获取线程的名称
2. void setName(String name)设置线程的名称
3. run()线程被调度的时候所调用的操作
4. void start()启动线程，并执行run()方法
5. static Thread currentThread() 返回当前线程
6. static void yield() 当前线程给其他线程让步 释放当前线程执行权
7. join() 在线程a 中调用线程b的join方法，此时线程a进入阻塞状态，直到线程b调用完毕后线程a才开始执行
8. stop()强制停止当前线程，不推荐使用
9. sleep(millitime) 让线程休眠，进入阻塞状态，millitime为毫秒单位
10. isalive()检查一个线程是否存活

### 14.4线程调度优先级getPriority()   

JAVA调度方法：

1. 相同优先级线程组成先进先出队列，（先到先服务），使用时间片策略
2. 高优先级者，使用优先调度抢占式策略
3. 设置线程优先级 setPriority()传输一个数字 MAX_PRIORITY  NORMAL_PRIORITY MIN_PRIORITY
4. 获取线程优先级，getPriority()   

### 14.5实现runnable接口

1. 创建一个实现了Runnable接口的类
2. 实现run()方法
3. 创建一个 Thread类实例对象
4. 创建一个实现了Runnable接口的类的实例对象
5. 将run对象放入 thread实例对象构造方法中
6. 调用thread实例对象的start方法





### 14.6 Object 常用线程三方法

1. wait()等待
2. notify()通知  唤醒被等待的线程    必须在同步代码块或者同步方法中使用
3. notifyAll()通知所有 唤醒所有被等待的线程



### 14.7守护线程和用户线程

守护线程定义：守护线程目的是为了服务用户线程，thread.setDaemon(true);可以将一个用户线程变为守护线程

守护线程：垃圾回收线程，异常处理线程

### 14.8线程生命周期

```java
 public enum State {
        /**
         * Thread state for a thread which has not yet started.
         */
        NEW,

        /**
         * Thread state for a runnable thread.  A thread in the runnable
         * state is executing in the Java virtual machine but it may
         * be waiting for other resources from the operating system
         * such as processor.
         */
        RUNNABLE,

        /**
         * Thread state for a thread blocked waiting for a monitor lock.
         * A thread in the blocked state is waiting for a monitor lock
         * to enter a synchronized block/method or
         * reenter a synchronized block/method after calling
         * {@link Object#wait() Object.wait}.
         */
        BLOCKED,

        /**
         * Thread state for a waiting thread.
         * A thread is in the waiting state due to calling one of the
         * following methods:
         * <ul>
         *   <li>{@link Object#wait() Object.wait} with no timeout</li>
         *   <li>{@link #join() Thread.join} with no timeout</li>
         *   <li>{@link LockSupport#park() LockSupport.park}</li>
         * </ul>
         *
         * <p>A thread in the waiting state is waiting for another thread to
         * perform a particular action.
         *
         * For example, a thread that has called <tt>Object.wait()</tt>
         * on an object is waiting for another thread to call
         * <tt>Object.notify()</tt> or <tt>Object.notifyAll()</tt> on
         * that object. A thread that has called <tt>Thread.join()</tt>
         * is waiting for a specified thread to terminate.
         */
        WAITING,

        /**
         * Thread state for a waiting thread with a specified waiting time.
         * A thread is in the timed waiting state due to calling one of
         * the following methods with a specified positive waiting time:
         * <ul>
         *   <li>{@link #sleep Thread.sleep}</li>
         *   <li>{@link Object#wait(long) Object.wait} with timeout</li>
         *   <li>{@link #join(long) Thread.join} with timeout</li>
         *   <li>{@link LockSupport#parkNanos LockSupport.parkNanos}</li>
         *   <li>{@link LockSupport#parkUntil LockSupport.parkUntil}</li>
         * </ul>
         */
        TIMED_WAITING,

        /**
         * Thread state for a terminated thread.
         * The thread has completed execution.
         */
        TERMINATED;
    }
```

1.  新建状态：当一个线程类或者其子类被声明并创建的时候，新生的线程对象处于新建状态，new一个线程类

   ​			过程=>调用start方法

2. 就绪状态：处于新建状态的线程被执行start时，进入线程队列等待CPU时间片，此时已经具备了被CPU执行的条件，只是还没有被执行。

   ​			过程=>CPU执行操作

3. 运行状态：就绪的线程获取CPU资源，进入运行状态，执行操作

   =>在本线程中调用其他线程join，导致本线程阻塞；sleep(millitime) 让线程休眠进入阻塞状态；wait;等待同步锁

4. 阻塞状态：某种情况下，线程被人为挂起或者其他操作影响，让出CPU并临时中止操作，进入阻塞状态

5. terminated  终止状态：线程完成全部任务或者其他异常情况导致结束



### 14.9线程同步

同步代码块 synchronized(lock   同步监视器){

同步代码

}

:taco:同步监视器：也就是锁可以使用 :sailboat:this来进行代替 ，第二可以使用 当前类的class来充当同步监视器​

:m:同步方法 :将需要操作共享数据的代码声明到一个方法中，并给方法设置 synchronized ，此方法称为同步方法,此时同步监视器为this

如果继承thread类想要使用同步方法来实现锁，则必须将同步方法写成静态的

:question: 静态同步方法的同步监视器为 class类本身

:question: 普通同步方法的同步监视器为this

### 14.10死锁

不同的线程分别占用对方的同步资源不放弃，都在等待对方放弃自己需要的同步资源，形成程序死锁

```java
public class Main {
    static final Object resourceA = new Object();
    static final Object resourceB = new Object();
    public static void main(String[] args) {
        //TIP 当文本光标位于高亮显示的文本处时按 <shortcut actionId="ShowIntentionActions"/>
        // 查看 IntelliJ IDEA 建议如何修正。
 Thread t1 = new Thread(() -> {
            synchronized (resourceA) {
                System.out.println("Thread 1: locked resource A");
                try { Thread.sleep(100); } catch (InterruptedException ignored) {}
                synchronized (resourceB) {
                    System.out.println("Thread 1: locked resource B");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (resourceB) {
                System.out.println("Thread 2: locked resource B");
                try { Thread.sleep(100); } catch (InterruptedException ignored) {}
                synchronized (resourceA) {
                    System.out.println("Thread 2: locked resource A");
                }
            }
        });

        t1.start();
        t2.start();

    }
}
```



### 14.11Lock锁解决线程安全问题 以及公平锁

```java
ReentrantLock类，定义实例

ReentrantLock lock=new ReentrantLock();

lock.lock();//加锁

try{

}finally{

lock.unlock();//解锁

}
```

ReentrantLock lock=new ReentrantLock();  参数加true ，则此锁为公平锁；

synchronized和reentrantlock之间的不同:question:

lock方式可以手动添加锁和解锁，灵活性高，有公平锁等多功能；synchronized则自动启动锁并自动释放锁



### 14.12线程通信

1. wait()等待，wait会释放锁（同步监视器）
2. notify()通知  唤醒被等待的线程    必须在同步代码块或者同步方法中使用，这两个方法是根据线程锁来进行通信的，锁不同，会报错！！！
3. notifyAll()通知所有 唤醒所有被等待的线程
4. wait() notify()和notifyAll()的方法调用者必须是同步代码块或者同步方法中的同步监视器，否则会报错





### 14.13生产者-消费者模型

## 

**核心思想：**

- **生产者（Producer）**：负责生产数据（或任务）；
- **消费者（Consumer）**：负责处理数据（或任务）；
- **共享缓冲区（Buffer / Queue）**：两者之间传递数据的桥梁；
- 必须使用**线程同步机制**保证数据安全。



### 14.14新增线程创建方式

:one:实现callable接口

重写call方法

创建callable实例，并使用FutureTesk类，放入callable实例。 使用futuretest类的get方法，get方法的返回值为call方法的返回值，get方法的目的是为了获取返回值并使用Thread类的构造方法传入FutureTesk类，调用start方法。

callable接口为泛型接口，FutureTesk为泛型类





:two: 使用线程池------线程管理  ----难度特别大

原因：对于经常创建和销毁使用量特别大的资源，如并发情况下的线程，对性能影响很大   ————工具实现类 ThreadPoolExecutor则包含我们所需的线程方法

corePoolSize:线程池的大小

maximumPoolSize:最大线程数

keepAliveTime:线程没有任务的时候最多保持多长时间后会终止......

Executors:线程池的工具类，工厂类，用于创建并返回不同类型的线程池；

ExecutorSerivce:线程池接口

Excutors.newCachedThreadPool()  创建一个可根据需要创建新线程的线程池

Excutors.newFixedThreadPool()创建一个固定数量线程的线程池

Excutors.newSingleThreadExecutor()创建只有一个线程的线程池

Excutor.newScheduledThreadPool(n)：创建一个线程池，它可安排给定延迟后运行命令或者定期的执行

Excutorserivce中有两个常用方法：

submit() 提交  适用于callable接口类型线程

void execute（）执行方法   适用于 runnable接口类型线程

void.shutdown()关闭连接池





## 15常用类String

### 15.1常用类String介绍

1. String实现Serializable接口,表示字符串是可以序列化的
2. String声明为final，表示String类无法被继承
3. String实现了Comparable接口，表示字符串可以比较大小
4. String定义了final char[]用于存储字符串，因final，则字符串为不可变，存储在字符串常量池中；

### 15.2String内存结构

通过字面量的方式给String赋值，String结果放入字符串常量池中，通过new方式给String赋值，String结果放入堆空间中



15.3String常用方法

1. int length() 获取一个字符串的字符长度；
2. char charAt(int index) 根据下标获取一个字符串的指定字符，从0开始；返回字符；
3.  boolean isEmpty() 判断一个字符串是否为空串；
4. toLowerCase()将字符串全部转小写；
5. toUpperCase()将字符串全部转大写；
6. trim()忽略字符串前后的空格，并将结果返回；
7. equals()比较两个字符串是否相同，为重写方法；
8. concat()连接两个字符串，返回最终连接的字符串；
9. compareTo()比较两个字符串的大小，根据unicode编码来判断，返回数字；
10. substring()返回一个字符串，它是此字符串从beginindex到endindex
11. boolean  endWith(String suffix)测试字符串是否以制定的后缀结束
12. boolean startsWith(String prefix)测试字符串是否以制定索引开始
13. boolean startsWith(String prefix,int toffset)测试字符串从制定索引开始的子字符串是否以指定前缀开始，后一个参数为指定位置
14. boolean contains(Charsquence s)当且仅当此字符串包含指定的char序列时，返回true;
15. int indexOf(String str):返回指定子字符串在当前字符串中出现的第一次的索引,未找到返回-1
16. int indexOf(String str,int fromIndex)返回指定子字符串在此字符串中第一次出现处的索引，从指定索引开始，未找到返回-1
17. int lastIndexOf(String str);返回指定子字符串在此字符串中最后出现的索引，未找到返回-1
18. int lastIndexOf(String str,int fromIndex)返回子字符串在此字符串中最后一次出现的索引，从指定索引开始，未找到返回-1
19. String replace(char oldChar,char newChar);返回一个新的字符串，它是通过newchar字符替换到所有的oldChar字符而来的
20. String replace(CharSequence target,CharSequence replacement);使用指定的字面值替换序列此匹配字面值目标序列的子字符串
21. String replaceAll(String regex,String replacement);使用给定的replacement替换此字符串所有匹配给定的正则表达式的子字符串。
22. String replaceFirst(String regex,String replacement)使用给定的replacement替换此字符串所有匹配给定的正则表达式的第一个子字符串。
23. boolean matches(String regex):告知此字符串是否匹配给定的正则表达式
24. String split(String regex)通过指定的正则表达式的匹配拆分此字符串。
25. String split(String regex,int limit); 通过指定的正则表达式的匹配拆分此字符串

### 15.3String和其他类型转化

静态方法parseXXX() 将其他类型转换为当前类型，valueOf()将其他类型转换为String类型

String.toCharArray()将字符串转换为字符数组的静态方法

String和byte[]之间的转化  ==>getBytes()







### 15.4StringBuffer和StringBuilder

String：是不可变字符序列，线程安全，效率偏低，建议多线程用，底层数据使用char数组存储数据。

StringBuffer是可变字符序列；线程安全，效率偏低，建议多线程用，底层数据使用char数组存储数据。当长度过长，将会扩容；

StringBuilder是可变字符序列；线程不安全，效率高，建议单线程用；底层数据使用char数组存储数据。当长度过长，将会扩容；

常用方法：

StringBuffer append(xxx)用于进行字符串拼接

StringBuffer delete(int start,int end)删除指定位置的内容，根据下标

StringBuffer replace(int start,int end,String str)将指定位置元素替换成str

StringBuffer setCharAt(int n,char  h)

StringBuffer CharAt()查找一个字符

StringBuffer insert(int offset xxx，str)向指定位置插入一串字符串

StringBuffer reverse():将当前数组逆序



### 15.5时间和日期

System.currentTimeMillis()返回当前时间和1970年1月1日之间的***时间戳***  通过时间戳将java.sql.Date和java.util.Date进行相互转换

:one:util.Date=new Date()创建一个当前时间的Date对象 

getTime();获取一个Date的时间戳

:two: java.sql.Date对应数据库中的日期变量

:three:SimpleDateFormat：简单日期格式化类,new SimpleDateFormat("指定格式字符串",语言)；

格式化： 日期变为---->字符串  调用Format()方法

解析：格式化的逆过程：---->日期  调用parse()方法

:four::calendar日历抽象类和gregorianCalendar();日历类无法实例化，只能使用getInstance方法或者调用公历日历类gregorianCalendar

常用方法：

1. get()通过常量获取时间
2. set()通过常量，更改成某个时间
3. add()在原有基础上添加多少时间
4. getTime()返回格式化日期，Date类
5. setTime()将Date类的时间设置成日历类Calendar的时间



### 1​5​.6​ ​java.time API新型java时间类API

:one:LocalDate本地日期类

1. now()根据当前时间创建本地日期对象
2. of()静态方法，根据指定日期时间创建对象
3. getDayofMonth()返回月份的天数
4. getDayofYear()返回年份的天数
5. getDayofWeek()返回星期几
6. getMonth()返回一个月份枚举值
7. getMonthValue()返回月份值
8. getYear()返回年份
9. withDayofMonth() WithDayofYear()WithMonth()WithYear()更改一月的某一天，更改一年的某一天，更改月份，更改年份



:two:LocalTime本地时间类

1. now()根据当前时间创建本地日期对象
2. of()静态方法，根据指定日期时间创建对象



:three:LocalDateTime本地日期时间类

1. now()根据当前时间创建本地日期对象
2. of()静态方法，根据指定日期时间创建对象
3. getDayofMonth()返回月份的天数
4. getDayofYear()返回年份的天数
5. getDayofWeek()返回星期几
6. getMonth()返回一个月份
7. getMonthValue()返回月份值
8. getYear()返回年份
9. withDayofMonth() WithDayofYear()WithMonth()WithYear()更改一月的某一天，更改一年的某一天，更改月份，更改年份
10. plusDays() plusMonths()plusWeeks()plusYears()plusHours()添加天数，添加月数，添加周数，添加年份，添加小时
11. minusMonths() MinusDays() MinusWeeks()MinusYears()MinusHours()减去月份，减去天数，减去小时，减去时间

### 15.7Instant瞬时类

面向计算机的时间瞬时类；

### 15.8DateTimeFormatter日期时间格式化类

1.ofPattern()静态方法，通过指定字符进行格式化

```java
     LocalDateTime d1=LocalDateTime.now();
        System.out.println(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss").format(LocalDateTime.now()));
```

2.parse("时间串")；解析时间串方法



## 16JAVA比较器comparable接口 和compartor 

### 16.1自然排序

必须实现compareTo方法

当前对象大于比较对象，返回正整数

当前对象小于比较对象，返回负整数

当前对象等于比较对象，返回0



### 16.2定制排序Compartor

重写compare()方法



## 17System类

1. native long  currentTimeMillis()返回当前时间时间戳

2. void exit(int status) 退出程序，status 为zero 则为正常退出，status 为负数，则为异常退出
3. System.gc()进行垃圾回收
4. System.getProperty(String key)获取系统中属性为key的属性值，例如java.version版本;java.home安装目录;os.name操作系统名称;os.version操作系统版本；user.name用户名；user.home用户主目录；user.dir;用户当前工作目录

## 18Math科学计算类

1. random()返回随机数

   其他方法详见开发文档！！！！！！！！！

## 19BigInteger Bigdecimal类

Biginteger大整数类型

Bigdecimal 大小数类型



## 20枚举类与注解

### 20.1自定义枚举类

```java
public  class Season {
    //声明Season对象的属性
    private final String seasonName;
    private final String seasonDesc;
    //声明私有化构造器
    private  Season(String seasonName,String seasonDesc){
        this.seasonName =seasonName;
        this.seasonDesc=seasonDesc;
    }

    public static final Season SPRING=new Season("春天","春暖花开");
    public static final Season SUMMER=new Season("夏天","夏日炎炎");
    public static final Season AUTUMN=new Season("秋天","秋有蚊子");
    public static final Season Winter=new Season("冬天","冬日炎炎");
    public String getSeasonName(){
        return this.seasonName;
    }
    public String getSeasonDesc(){
        return this.seasonDesc;
    }
}
```







### 20.2enum关键字定义枚举类

提供当前对象的名字，全部大写并后跟构造器函数括号，重写构造器。并定义相关参数；

enum类中的toString()方法被重写过，是因为enum枚举类默认继承于Enum类

```java
public enum Week {
    MONKEY("星期一"),
    TUESDAY("星期二"),
    WEDNESDAY("星期三"),
    THURSDAY("星期四"),
    FRIDAY("星期五"),
    SATURDAY("星期六"),
    SUNDAY("星期天");

    String name;
    private Week(String str){
        this.name =str;
    }

}



```
### 20.3Enum类常用方法  枚举类为一个对象
1. values实例方法，返回枚举类型的对象数组。
2. valueOf可以将一个字符串转换为对应的枚举类对象，要求字符串的名字必须是枚举类对象的名字，如果不是则报错
3. toString返回当前枚举类常量的名称

枚举类的写法多样化，例如，1 将枚举类写到一个类中；2将枚举类作为一个单独的类实现。内部写法颇为不同，
例如可只写常量名，不写内部构造；同样也可以给每一个枚举类对象写内部构造，拥有内部构造枚举类对象必须
实现构造器；枚举类可实现其他接口，可单独给每一个枚举类对象实现接口方法，也可给所有枚举类对象设置同一个
接口方法

```java

public enum Week implements info{
    MONDAY("星期一"){
        @Override
        public void show(){
            System.out.println("1");
        }
    },
    TUESDAY("星期二"){
        @Override
        public void show(){
            System.out.println("2");
        }
    },
    WEDNESDAY("星期三"){
        @Override
        public void show(){
            System.out.println("3");
        }
    },
    THURSDAY("星期四"){
        @Override
        public void show(){
            System.out.println("4");
        }
    },
    FRIDAY("星期五"){
        @Override
        public void show(){
            System.out.println("5");
        }
    },
    SATURDAY("星期六"){
        @Override
        public void show(){
            System.out.println("6");
        }
    },
    SUNDAY("星期天"){
        @Override
        public void show(){
            System.out.println("7");
        }
    };

    String name;
    private Week(String str){
        this.name =str;
    }

}

```


## 21注解Annotation
注解Annotation其实就是代码的特殊标记，这些标记可以在编译，类加载，运行时被读取，并执行相应的处理。使用
Annotation程序员可以在不改变原有逻辑的情况下，在源文件中嵌入一些补充信息，代码分析工具，开发工具，部署工具
可以通过这些补充信息进行验证或者部署。

注解可以像修饰符一样被使用，可以用于修饰包，类，构造器，方法，成员变量，参数，局部变量的声明，信息被保存在
Annotation的名值对结构中。


### 21.1注解类型

@author  作者注解

@Description 描述注解

@Version 版本信息

@date 时间注解

@param 参数注解

@return 返回值注解

@Override 重写/实现方法注解,该注解只能适用于方法

@Deprecated 方法，类过时注解

@SuppressWarning 抑制编译器警告注解

@BeforeClass Junit单元测试注解

@Before Junit单元测试注解

@Test Junit单元测试注解

@After Junit单元测试注解

@AfterClass Junit单元测试注解

@Exception 对可能抛出的异常进行说明

@See 参考转向文档





### 21.2自定义注解

```java
public @interface Interself {

    String[] value() default "";
}

```

### 21.3元注解 meta annotation

元注解就是用来修饰其他注解的注解

1. Retention 注解生命周期  SOURCE  CLASS                 RUNTIME可通过反射获取
2. Target 用于指定被修饰的 Annotation能够修饰那些成员元素 例如类，字段，枚举，方法，构造器，参数等等等等
3. Documented 被指定的注解 注解类会被javadoc提取成为文档，例如deprecated抛弃
4. Inherited 某个类的注解拥有Inherited,则他的子类也将拥有这个注解

### 21.4可重复注解/类型注解

可重复注解，将多个注解写到一起，则我们再次创建注解并放入一个数组。

@Repeatable（） 可重复注解，元注解类型，表示注解类型可重复使用

类型注解 




## 22异常处理






















## 23继承




















## 24封装







 







## 25集合

### 25.1常用集合

数组存储数据的特点以及缺点：长度一定，类型固定

java中分为两大部分的集合

:one: collection单列集合  

​	:one: set 不可重复，元素无序列的集合

​		:one: HashSet  

​		:two: LinkedHashSet  

​		:three:TreeSet  常用

​	:two: list 可重复元素，有序列的集合  用来替换数组，我们或者称之为动态数组

​		:seedling:Arraylist集合  

​		:seedling:Linkedlist集合

​		:seedling: Vector集合

:two:Map映射集合	

:seedling: HashMap

:seedling: LinkedHashMap

:seedling: TreeMap

:seedling: Hashtable

:seedling: Properties



### 25.2Collection接口 集合接口

1. add(Object o) 添加一个元素 将任意一个对象添加到我们当前的集合中。

2. size() 获取我们当前集合的中添加的元素长度。

3. addAII()添加多个元素，多个元素为一个集合类型。

4. isEmpty()判断当前集合是否为空，是否有元素，或者说元素是否为0。

5. clear()清空集合元素。

6. contains() 判断参数元素在集合中是否存在，存在为true,不存在为false；

7. containsAll()判断一个迭代器对象中的元素在集合中是否为子集，否为false,是为true;

8. remove()移除一个元素，返回值为boolean表示是否移除成功，也会调用equals操作，如果找到多个，则只会删除找到的第一个

9. removeAll()从一个集合中移除多个元素，找到了就移除，没找到就不移除，只要移除了某一个就会返回true

10. retainAll()求两个集合的交集，并将最后交集给调用集合

11. hashCode() 返回当前对象的 hash值

12. toArray()将集合转换为一个数组；返回值类型为Object类型的数组

13. Arrays.asList()参数为可变形参，将多个可变形参转换为一个集合

14. equals() 比较两个集合之间是否相等，其中在list<T>中对equals方法进行了重写操作

15. Iterator<E>()迭代器，用于遍历集合元素

    

### 25.3iterator迭代器对象   迭代器对象只能消耗一次

主要用于遍历Collection集合中的元素。

GOF提出，提供一种方法访问一个容器container对象中的各个元素，又不暴露该对象的内部细节。迭代器模式就是为容器而生。

主要方法

1. hasNext()如果容器中还存在没有遍历的元素，则返回true; 判断是否还有下一个元素
2. next()返回下一个将要遍历的元素； 如果没找到，则会报异常NoSuchElementException
3. remove()，删除迭代器当前游标指向的元素，调用多次remove会报错！！！！！！！未调用next()就调用remove（）也会报错！！！！！！！！！！！！！





### 25.4foreach增强循环

底层调用iterator来实现循环遍历

```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Test {
    @org.junit.Test
    public void Test1(){
        Collection coll3 = new ArrayList();
        coll3.add(123);
        coll3.add(456);
        coll3.add(false);
       for(Object o : coll3){
           System.out.println(o);
       }
    }
}

```



### 25.5List接口，有序，可重复。动态数组；

ArrayList和LinkedList vector三者

相同点:都实现了的List接口，存储数据的特点相同，数据都是有序的，可重复的；

ArrayList是一个线程不安全的类，效率高，底层使用Object数组存储数据

Vector是一个线程安全的类，效率差，底层使用Object数组存储数据

LinkedList底层使用双向链表存储，对于频繁的删除，插入数据，使用LinkedList链式集合比ArrayList效率要高



### 25.6ArrayList底层详解

1. 创建此对象首先在底层创建一个object类型的长度为10的数组
2. 如果在添加元素过程中size大于object数组的长度，则在数组原有长度基础上，扩容1.5倍
3. 如果新容量比要添加的元素长度还要小，则将要添加的元素长度给新容量
4. 如果新容量比数组可以容纳的最大容量还要大，则报错......





### 25.7List接口常用方法



1. add(int index ,Object ele)在index位置插入ele元素
2. addAll(int index,Collection coll)在index位置插入多个ele元素
3. get(int index)获取指定位置的元素
4. indexOf(Object obj)获取obj元素在集合中首次出现的位置,如果不存在，返回-1
5. lastindexOf(Object obj)获取Obj元素在集合中最后出现的位置，如果不存在，返回-1
6. remove()根据一个索引删除一个元素；或者根据一个元素删除一个元素。返回删除的元素
7. subList()获取一部分集合元素，参数为索引，包含前一个索引，不包含后一个索引
8. set(int index,ele)设置指定位置的元素为ele



### 25.8HashSet  数组加链表

Set接口的主要实现类，线程不安全的，无序的，不可重复的集合，可以存储null值

无序性：不等于随机性；在存储空间中为无序，根据数据的hash值进行添加

不可重复性:保证添加的元素按照equals（）判断时，不能返回true,即相同元素只能添加一个,先比Hashcode，后比equals

底层为一个数组，数组长度为16.

存储原理：我们向HashSet中添加元素a,首先调用元素a所在类的hashCode()方法，计算元素a的哈希值，此哈希值接着通过某种算法计算出在HashSet底层数组中的存放位置（即为相应索引位置），判断数组此位置上是否已经有元素，如果此位置没有其他元素，则将a元素给放入到此位置。（情况1）

如果此位置上有其他元素，则比较元素a和元素b的哈希值，如果哈希值不相同，则元素a添加成功。（情况2）

如果哈希值相同，造成哈希冲突，进而调用元素a的equals方法，判断是否相同，返回true，则添加失败。返回false，则元素a添加成功。（情况3）

情况2和情况3则在当前索引上数据以链表的形式进行存储。jdk7为头插法，jdk8为尾插法。

如果数组占用率超过百分之75，则扩容到原有容量大小的2倍





### 25.9LinkedHashSet 顺序遍历hashset

线程不安全，无序的，不可重复的集合，是Hash的子类，可以按照添加的顺序来进行遍历

### 25.10TreeSet  树集合  中序排序

使用红黑树来存储数据，数据类型唯一；按照对象的某个属性进行排序。存储的数据类型必须是同一个类的对象；！！！！！

TreeSet中，判断元素是否相同的标准不再是equals 和HashCode，**而是比较器CompareTo和定制排序Compare**

自然排序

```java
 @Override
    public int hashCode(){
        int result= name!=null ? name.hashCode() : 0;
        result = 31*result+age;
        return result;
    }

    @Override
    public boolean equals(Object stu) {
        if(stu instanceof Student){
            Student stu2 = (Student) stu;
            return stu2.getName().equals(this.getName()) && stu2.getAge() == this.getAge();
        }
        else{
            return false;
        }
    }
//    @Override
//    public int compare(Student stu1,Student stu2){
//        return stu1.getName().compareTo(stu2.getName())+stu1.getAge()-stu2.getAge();
//    }

    @Override
    public int compareTo(Student stu){
        return  this.getName().compareTo(stu.getName());

    }
```

定制排序

重写Comparator接口，实现compare方法

```java
  @Test
    public void test1(){

        Comparator comparator = new Comparator() {
            @Override
           public int compare(Object o1, Object o2) {
                if(o1 instanceof Student && o2 instanceof Student){
                    Student s1=(Student)o1;
                    Student s2=(Student)o2;
                    return Integer.compare(s1.getAge(), s2.getAge());

                }else{
                    throw new RuntimeException();
                }

            }
        };
      TreeSet set=new TreeSet(comparator);
        set.add(new Student("lisa",20));
        set.add(new Student("dade",30));
        set.add(new Student("jack",40));
        set.add(new Student("jack",18));
        set.add(new Student("aim",10));
        set.add(new Student("bob",9));



      for (Object o : set) {
          System.out.println(((Student)o).getName()+"~~~"+((Student)o).getAge());
      }
    }
}
```





























