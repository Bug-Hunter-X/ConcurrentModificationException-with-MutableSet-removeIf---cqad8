# Kotlin MutableSet removeIf ConcurrentModificationException

This example demonstrates a subtle difference between `MutableList` and `MutableSet` in Kotlin when using the `removeIf` function.  Modifying a collection while iterating over it (directly or indirectly) using an iterator usually leads to unexpected behaviors.  The `removeIf` method internally uses an iterator, making it susceptible to this issue in the case of `MutableSet`. 

The provided code showcases how `removeIf` works correctly with `MutableList` but throws a `ConcurrentModificationException` when applied to a `MutableSet`.  The solution outlines ways to avoid this exception.