In Java, the constructors are used to prepare a newly created object for use by initilaizing values passed to it as parameters.

Similarly, when the GC (Garbage Collector) decides to remove an object from memory, it calls the finalize() method on the object.

The finalize() method is declared in the Object class. Hence it is available in every class.

The default finalize() method available in the Object class does not do anything.

A Java class can override and provide its special implementation in the finalize() method.

Normally we do not override finalize to provide any special implementation. However, it is good to know that we do not call the finalize() method, it is the GC which calls it.


Answer

GC (Garbage Collector Thread) automatically calls the finalize method of the object whenever it is trying to reclaim the memory occupied by the object.