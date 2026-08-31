1. Class and Object
Q1.1: What is a Class and what is an Object in Java?

Answer: A Class is a user-defined blueprint or template that defines the structure (fields) and behavior (methods) of an entity. An Object is an active instance of a class created in memory containing concrete values for those fields.

Q1.2: Where are classes and objects stored in Java memory architecture?

Answer: Class structures, metadata, and bytecodes are loaded into the Metaspace (formerly Method Area). Objects and their instance variables are stored in the Heap Memory.

Q1.3: What happens when the new keyword is executed in Java?

Answer:

Memory is dynamically allocated in the Heap for the new object.

Instance variables are initialized to their default values (e.g., 0, null, false).

The class constructor is invoked to initialize custom values.

The memory address (reference) of the newly allocated object is returned.

Q1.4: Can a Java class exist without a main method? Can it run without one?

Answer: Yes, a class can exist without a main method (e.g., helper classes, model classes, library utility classes). However, to run an application directly as an entry point from the command line, execution requires a standard public static void main(String[] args) method.

2. Instance Variables
Q2.1: What are instance variables, and where are they stored in memory?

Answer: Instance variables are fields declared inside a class but outside any method or block. They represent the state of an object and are allocated inside Heap Memory as part of the object.

Q2.2: What are the default values assigned to primitive and non-primitive instance variables?

Answer:

byte, short, int, long: 0

float, double: 0.0

char: '\u0000' (null character)

boolean: false

Object References (String, custom classes, arrays): null

Q2.3: What is the difference between instance variables and local variables?

Answer:

Instance Variables: Declared in class body; allocated in Heap when object is created; receive default values if uninitialized; accessible throughout the class based on access modifiers.

Local Variables: Declared inside methods/constructors/blocks; allocated on the Stack frame; must be explicitly initialized before use; accessible only within their declaring scope.

Q2.4: Can instance variables be declared as final without initialization?

Answer: They can be declared without initialization at the point of declaration, but they must be initialized in every constructor (or instance initializer block) before object construction completes. Otherwise, a compile-time error occurs.

3. Instance Methods
Q3.1: What is an instance method, and how does it differ from a static method?

Answer: An instance method belongs to an object instance and requires an object to be invoked. It can access both static members and instance variables via this. A static method belongs to the class itself, requires no object instantiation to run, and cannot directly access instance fields or this.

Q3.2: Can an instance method access static variables and static methods directly?

Answer: Yes. Since static members exist when the class is loaded, instance methods can freely read/modify static fields and call static methods directly.

Q3.3: How does the runtime engine know which object invoked an instance method?

Answer: Under the hood, Java implicitly passes the current object reference as a hidden first parameter named this into every non-static method call.

4. Object Reference
Q4.1: What is an object reference variable? Is it the object itself?

Answer: An object reference variable holds the memory address location pointing to the actual object in the Heap. It is not the object itself; it is a handle used to access and manipulate the object.

Q4.2: What happens if you try to invoke a method or access an instance variable on a null reference?

Answer: Java throws a NullPointerException at runtime because the variable does not point to any valid object memory address in the Heap.

Q4.3: Where are reference variables stored vs the actual objects they point to?

Answer:

Reference variables declared inside methods reside on the Stack Frame.

Reference variables declared as fields inside a class reside in the Heap inside their parent object.

The actual objects always reside in the Heap.

5. Constructors
Q5.1: What is a constructor in Java, and what is its primary purpose?

Answer: A constructor is a special block of code that shares the exact name of its class and lacks a return type. Its primary purpose is to initialize instance variables when an object is instantiated.

Q5.2: What is the default constructor? When does Java compiler automatically create one?

Answer: A default constructor is an unwritten, no-argument constructor inserted automatically by the compiler only if no user-defined constructors exist in the class.

Q5.3: Can a constructor have a return type like void or int? What happens if you add a return type?

Answer: No, constructors cannot have return types. If you add a return type (e.g., public void Student()), Java treats it as a standard instance method rather than a constructor.

Q5.4: Can constructors be marked as private? If yes, what is a practical use case?

Answer: Yes. Private constructors prevent external classes from creating instances using new. Practical use cases include implementing the Singleton Pattern, utility classes containing only static methods (e.g., java.lang.Math), or factory patterns.

6. this Keyword
Q6.1: What is the this keyword in Java?

Answer: this is a reference variable that holds the memory address of the current executing object instance.

Q6.2: Why do we use this inside constructors and instance methods?

Answer: It resolves variable shadowing when instance variables and parameter/local variables share identical names (e.g., this.name = name). It is also used for constructor chaining (this(...)) and passing the current object to other methods.

Q6.3: Can this be used inside a static method? Why or why not?

Answer: No. Static methods execute in a class-level context without an active instance reference, so accessing this results in a compile-time error.

7. Parameterized Constructor
Q7.1: What is a parameterized constructor?

Answer: A parameterized constructor accepts one or more arguments, allowing caller code to initialize an object with specific custom data upon creation.

Q7.2: If a parameterized constructor is defined in a class, does the compiler still provide a default no-argument constructor?

Answer: No. Defining any explicit constructor suppresses the compiler's automatic creation of the default no-argument constructor.

Q7.3: What occurs if code tries to instantiate an object using new ClassName() when only a parameterized constructor exists?

Answer: A compile-time error occurs (constructor ClassName() is undefined) because no parameterless constructor exists.

8. Constructor Overloading
Q8.1: What is constructor overloading in Java?

Answer: Defining multiple constructors within the same class, each having the same name but differing parameter lists (number, type, or order of parameters).

Q8.2: How does Java distinguish between multiple overloaded constructors?

Answer: By checking the signature of the constructor call at compile time (i.e., the count, data types, and order of passed arguments).

Q8.3: Can constructors be overloaded based only on different access modifiers?

Answer: No. Constructor overloading strictly depends on parameter lists. Changing only access modifiers without changing parameter parameters yields a compile-time duplicate error.

9. Constructor Chaining
Q9.1: What is constructor chaining and how is this() used to achieve it?

Answer: Constructor chaining is the process of calling one constructor from another within the same class using this(...) to share setup code and avoid duplicate initialization.

Q9.2: What is the rule regarding the placement of this() inside a constructor body?

Answer: this(...) must be the very first executable statement inside the constructor body.

Q9.3: Can two constructors call each other recursively using this() (e.g., Constructor A calls B, and B calls A)? What happens?

Answer: No. Circular/recursive constructor calls cause a compile-time error (Recursive constructor invocation).

10. Reference Sharing
Q10.1: What happens when one reference variable is assigned to another reference variable (ref2 = ref1)?

Answer: ref2 gets a copy of the memory address stored in ref1. Both reference variables now point to the exact same object in Heap memory.

Q10.2: Does Java pass objects by value or by reference? Explain reference passing in Java.

Answer: Java is strictly pass-by-value. When passing an object reference to a method or variable, Java passes a copy of the reference address value, not the actual reference variable itself or the underlying object.

Q10.3: If modifications are made to an object using ref2, will those changes be reflected when accessing the object via ref1? Why?

Answer: Yes. Because ref1 and ref2 hold identical memory addresses pointing to the single object in Heap memory, mutating the state through either reference updates that single shared instance.
