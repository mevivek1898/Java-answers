Collection is the root interface of the collection hierarchy, meaning all other collection interfaces like Set, List and Queue extend Collection.

A collection is a group of objects. These objects are referred as elements of the collection.

The most commonly used methods in the Collection interface to manipulate and query the underlying collection are : add(E e) , remove(Object obj), contains(Object obj), size().

Note: In most of the interfaces and classes in the collection framework, you will find notations like E, K, V used for parameter types or return types. They are related to generic syntax. We will learn more about them in the sections related to generics. For now you can safely assume Object as the type, whenever you see these characters.

Select all the correct statements given below.
[Hint: Click on the methods to learn what they do.]



Answer

The size() method in the collection interface returns an int value which contains the count of elements present in that collection.
The clear() method in the collection interface removes all the elements present in that collection.
The isEmpty() method in the collection interface returns true, if the collection is empty and returns false otherwise.