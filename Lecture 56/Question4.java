The interfaces Set, List and Queue extend Collection. Some of these also add additional methods apart from the methods present in Collection interface.

A Set does not allow duplicate elements. Meaning, when the add method is called by passing an element which is already present, the underlying Set implementation does not add the element again and returns false (false indicates that the collection was not modified by the add method call).

A List is essentially a flexible array. It maintains the order of elements and also allows index-based access of elements like an array (which a Set does not). It allows duplicate elements.

A Queue interface provides methods for a queue data structure implementing first-in-first-out (FIFO). There are special implementations of Queue interface like PriorityQueue, which may alter this behaviour.

A Map is a collection of key-value pairs and not just elements.


Answers

A Set does not accept duplicate elements.
A List allows index-based access of elements.