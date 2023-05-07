# Notes for Collection frameworks Lessons #
### Files structures
- All the main files are in src dir
- if you see out, that is the generated files from jvm
### Topics
* List([Arraylist](src/ArrayListEg.java), LinkedList)
* [LinkedList](src/LnkdLstEg.java)
  * can extend both list and queue
  * add, remove, set, contains empty pull poll addNext ...
* [queue](src/QueueEg.java)(First-in-first-out) just like in grocery stores cashiers
  * push(), pop(), peek(), size()
  * extends collections interface
  * you can use LinkedList and PriorityQueue to use queue
* [stack](src/MyStackEg.java)(Last-in-first-out) just like Pringles
  * it extends Vector class and vector extends list
  * push, pop, peek, size
* tree data structure
  * Binary Tree(A tree consists of Nodes that have only two child nodes)
  * [BFS](src/MyBinaryTree.java) and [DFS](src/MyBinaryTree.java) 
* [Hashmap](src/MyHashMap.java) and [hashset](src/MyHashSet.java)
  * Hashset is not in order, and it does not hold duplicate values 
  * hashmap has key,value combination(best for data handling)
* [FileHandling](src/CreateFile.java)
  * use File class and its method(createNewFile()) to create a file
  * use FileWriter class to write
  * use Scanner to read