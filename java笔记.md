---

---

# 				java

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

常用类String两个特性：不可继承性，不可变性































