import java.io.*;

public class Person implements Serializable{
	String name;
	transient int age;
}