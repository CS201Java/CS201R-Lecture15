import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


//Example 3
import java.util.Collections;
import java.util.Arrays;

//Example 4
import java.util.Vector;
import java.util.Stack;
import java.util.Deque;
import java.util.ArrayDeque;

//Example 5
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Comparator;

//Example 7 & 8
import java.util.Set;
import java.util.TreeSet;
import java.util.Map;
import java.util.TreeMap;

public class Functions{
    
    //EXAMPLE 1: COLLECTION EXAMPLE 1
    public static void example1Collection() {
        System.out.println("\n\nEXAMPLE 1: COLLECTION");

        //Different implementations of collection1:
        ArrayList<String> collection1 = new ArrayList<>();
        //List<String> collection1 = new ArrayList<>();
        //List<String>collection1 = new LinkedList<>();

        collection1.add("New York");
        collection1.add("Atlanta");
        collection1.add("Dallas");
        collection1.add("Madison");

        System.out.print("A list of cities in collection1: ");
        System.out.println(collection1);

        System.out.print("Is Dallas in collection1? "
        + collection1.contains("Dallas"));

        collection1.remove("Dallas");
        System.out.print("\n\n" + collection1.size() +
        " cities are in collection1 now");

        Collection<String> collection2 = new ArrayList<>();
        collection2.add("Seattle");
        collection2.add("Portland");
        collection2.add("Los Angeles");
        collection2.add("Atlanta");

        System.out.print("\nA list of cities in collection2: ");
        System.out.println(collection2);

        //the following creates c1
        //    a new ArrayList that is a copy of collection1
        ArrayList<String> c1 = new ArrayList<String>(collection1);
        System.out.print("Cities in c1 (based on collection1): ");
        System.out.println(c1);

        c1.addAll(collection2);
        System.out.print("Cities in c1 (collection1 union collection2): ");
        System.out.println(c1);

        c1 = new ArrayList<String>(collection1);
        c1.retainAll(collection2);
        System.out.print("Cities in c1 (collection1 intersection collection2): ");
        System.out.println(c1);

        //YOU TRY IT: USE REMOVEALL TO LIST THE CITIES IN COLLECTION 1, BUT NOT IN COLLECTION2
        c1 = new ArrayList<String>(collection1);

        
        System.out.println(c1);

        //USING AN ITERATOR
        System.out.print("Print of the collection1 using iterator: ");
        Iterator<String> iterator = collection1.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next().toUpperCase() + " ");
        }
        System.out.println();
 
    }
    
    public static void example2Collections(){
        System.out.println("\n\nEXAMPLE 2: COLLECTIONS");
        System.out.printf("%-50s", "Collections Sort: display sorted list:");
        List<String> list1 = Arrays.asList("red", "green", "blue");

        //this sort uses natural ordering of objects
        Collections.sort(list1);
        System.out.println(list1);

        System.out.printf("%-50s","Collections Sort: display reverse ordered list: ");
        List<String> list2 = new ArrayList<> (Arrays.asList("yellow", "red", "green", "blue"));
           
        //YOU TRY IT: add sort for reversed order:



        System.out.println(list2);

        //Combine both lists
        list2.addAll(list1);
        System.out.printf("%-50s","Combination of list 1 and list 2:  ");
        System.out.println(list2);

        System.out.printf("%-50s","Collections binarySearch:, find green & Green:  ");
        System.out.print("(1) Index: " + Collections.binarySearch(list2,"green") +  "  ::  ");
        System.out.println("(2) Index: " + Collections.binarySearch(list2, "Green"));
 
        
        System.out.printf("%-50s","Collections Shuffle: display shuffled list: ");
        Collections.shuffle(list2);
        System.out.println(list2);

        System.out.printf("%-50s","Collections Copy: display new list that copies list3 into list2: ");
        List<String> list3 = Arrays.asList("purple", "orange", "black", "white");
        Collections.copy(list2, list3);
        System.out.println(list2);

        System.out.printf("%-50s","Collections Disjoint: display outcome of testing for disjoint:  ");
        System.out.print(Collections.disjoint(list1, list2) + "  ::  ");
        System.out.println(Collections.disjoint(list1, list3));

        System.out.println("\n\nEXAMPLE 2: COLLECTIONS - OBJECTS USING SORTS");

        List<Student> list4 = new ArrayList<>();

        list4.add(new Student(3, "Smith", "Alice", "Biology"));
        list4.add(new Student(2, "Jackson", "Bob", "Mathematics"));
        list4.add(new Student(1, "Smith", "Brian", "Chemistry"));
        list4.add(new Student(5, "Adams", "Carol", "Computer Science"));

        Student s1 = new Student(4, "Adams", "Wednesday", "Engineering");
        Student s2 = new Student(5, "Jackson", "Percy", "Engineering");
        list4.add(s1);
        list4.add(s2);
        System.out.println(list4);

        list4.sort(Comparator.comparing(Student::getLastName));
        System.out.println(list4);

        //YOU TRY IT:print list2 in reverse order
        Collections.sort(list2, Collections.reverseOrder());  
        System.out.println(list4);

        //YOU TRY IT:thenComparing statement to also sort by id 


    } 
    public static void example3List(){
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1); // 1 is autoboxed to new Integer(1)
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(1);
        arrayList.add(4);
        arrayList.add(0, 10);
        arrayList.add(3, 30);

        System.out.println("\n\nEXAMPLE 3: LISTS");
        System.out.print("A list of integers in the array list:");
        System.out.println(arrayList);

        LinkedList<Object> linkedList = new LinkedList<>(arrayList);
        linkedList.add(1, "red");
        linkedList.removeLast();
        linkedList.addFirst("green");

        System.out.print("Display the linked list forward:  ");
        ListIterator<Object> listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) 
           System.out.print(listIterator.next() + " ");

        //YOU TRY IT:
        //NOTE: a standard iterator cannot print in reverse
        System.out.print("\nDisplay the linked list backward:  ");



        System.out.println();
    }

    public static void example4VectorStack(){

        System.out.println("\n\nEXAMPLE 4: VECTOR EXAMPLE");

        Vector<Integer> stack = new Vector<>();  //old school style
        //Stack<Integer> stack = new Stack<>();
        //Deque<Integer> stack = new ArrayDeque<>();

        // Push elements (add to top)
        stack.add(10);
        stack.add(20);
        stack.add(30);
        stack.add(40);
        stack.add(50);

        System.out.println("Stack Elements: " + stack);

        // Peek (look at the top element)
        int top = stack.lastElement();
        System.out.println("Stack: Top element: " + top);

        // Pop (remove from top)
        stack.remove(stack.size() - 1);
        System.out.println("Stack: After pop: " + stack);

        // Push another element
        stack.add(40);
        System.out.println("Stack: After pushing 40: " + stack);

        // Check if empty
        System.out.println("Stack: Removing All Elements: ");
        while (!(stack.isEmpty())) {
            top = stack.lastElement();
            System.out.print(top + " ");
            stack.remove(stack.size() -1);
        }


        System.out.println("\n\nEXAMPLE 4: STACK EXAMPLE");
        Stack<Character> stack2 = new Stack<>();
        ArrayList<String> wordList = new ArrayList<>(Arrays.asList("tacocat", "bubba","a", "mom","abba" ));
        boolean isPal;
        //for each word in the wordList
        for (String w : wordList){
            //clear stack & set isPal to true (assume the word is a palindrome)
            stack2.clear();
            isPal = true;

            //push all letters onto the stack
            for (int i = 0; i < w.length(); i++)
                stack2.push(w.charAt(i));

            //for each character in the word
            //the character should equal the last item pushed onto the stack
            //YOU TRY IT




            System.out.println("The word: " + w + " is a palindrome? " + isPal);
        }
    } 

    public static void example5Queue(){
        System.out.println("\n\nEXAMPLE 5: USING QUEUES");
        Queue<String> queue = new java.util.LinkedList<>();
        queue.offer("Oklahoma");
        queue.offer("Indiana");
        queue.offer("Georgia");
        queue.offer("Texas");

        while (queue.size() > 0)
            System.out.print(queue.remove() + " ");
       

        System.out.println("\n\nEXAMPLE 5: USING PRIORITYQUEUES");
        PriorityQueue<String> queue1 = new PriorityQueue<>();
        queue1.offer("Oklahoma");
        queue1.offer("Indiana");
        queue1.offer("Georgia");
        queue1.offer("Texas");

        System.out.print("Priority Queue: Using Comparable:  ");
        while (queue1.size() > 0) {
             System.out.print(queue1.remove() + " ");
        }

        PriorityQueue<String> queue2 = new PriorityQueue<>(4, Collections.reverseOrder());
        queue2.offer("Oklahoma");
        queue2.offer("Indiana");
        queue2.offer("Georgia");
        queue2.offer("Texas");

        System.out.print("\nPriority Queue: Using Comparator:  ");
        while (queue2.size() > 0) {
            System.out.print(queue2.remove() + " ");
        }

        //creating your own custom comparator
        PriorityQueue<String> queue3 = new PriorityQueue<>(Comparator.comparingInt(String::length).reversed());
        queue3.offer("Oklahoma");
        queue3.offer("Indiana");
        queue3.add("Georgia");
        queue3.add("Texas");
        System.out.print("\nPriority Queue: Using Custom Comparator:  ");
        while (queue3.size() > 0) {
            System.out.print(queue3.remove() + " ");
        }

        
        //YOU TRY IT
        //ADD A COMPARATOR FOR QUEUE4
        //ADD 2 STATES
        PriorityQueue<String> queue4 = new PriorityQueue<>();
        queue4.offer("Oklahoma");
        queue4.offer("Indiana");
        queue4.add("Georgia");
        queue4.add("Texas");
        System.out.print("\nPriority Queue: Using Custom Comparator:  ");
        while (queue4.size() > 0) {
            System.out.print(queue4.remove() + " ");
        }
    }

    public static void example6ArrayDeque(){

        System.out.println("\n\nEXAMPLE 6: USING ARRAYDEQUE COMMANDS FOR PALINDROME");

        ArrayList<String> wordList = new ArrayList<>(Arrays.asList("tacocat", "bubba","a", "mom","abba" ));
        boolean isPal;

        Deque<Character> stack3 = new ArrayDeque<>();
        for (String w : wordList){
            //clear stack
            isPal = true;
            stack3.clear();
            for (int i = 0; i < w.length(); i++)
                stack3.push(w.charAt(i));

            //for each character in the word
            //the character should equal the last item pushed onto the arrayDeque              
            for (int i = 0; i < w.length(); i++){
                char stackChar = stack3.peek();
               if (stackChar != w.charAt(i)){
                   isPal = false;
                  break;
                }
                stack3.pop();
            }

            System.out.println("The word: " + w + " is a palindrome? " + isPal);
        }

        //setup the character types and the expressions to evaluate
        Set<Character> operands = new java.util.TreeSet<>(Set.of('1','2','3','4','5','6','7','8','9','0'));
        Set<Character> operators = new java.util.TreeSet<>(Set.of('+','-','/','*'));
        ArrayList<String> expList = new ArrayList<>(Arrays.asList("7 8 * 4 + 6 -", "3 4 5 * 6 + -", "7 2 * 5 - 9 +"));

        //set up the 'stack' using an ArrayDeque
        Deque<Integer> stack4 = new ArrayDeque<>();
        for (String e : expList){
            //clear stack
            stack4.clear();


            for (int i = 0; i < e.length(); i++){
                if (e.charAt(i) == ' ')                     //if input character is a space - ignore this
                    continue;
                if (operands.contains(e.charAt(i))){        //if input character is an operand - push this onto the stack
                    int temp = Integer.parseInt(e.substring(i,i+1));
                    stack4.push(temp);
                }
                //else if input character is an operator & the stack has 2 or more elements
                // pop the right & left values
                // perform the operation & push the result onto the stack
                //YOU TRY IT
                else if (operators.contains(e.charAt(i))){
                    if (stack4.size() >= 2){





                    }
                    else{
                        System.out.println("not enough operands for operator");
                    }
                }
                else
                    System.out.println("invalid char in list");
            }
            
            int temp = stack4.pop();
            System.out.println("The expression: " + e + " = " + temp);
        }
    } 

    public static void example7Sets(){
        System.out.println("\n\nEXAMPLE 7: USING HASHSETS");
        Set<String> set1 = new java.util.HashSet<>();
        
        // Add strings to set1
        set1.add("London");
        set1.add("Paris");
        set1.add("New York");
        set1.add("San Francisco");
        set1.add("Beijing");
        
        System.out.print("set1: " + set1);
        System.out.println(". There are " + set1.size() + " elements in set1");
        
        // Delete a string from set1
        set1.remove("London");
        System.out.print("set1: " + set1);
        System.out.println(". There are " + set1.size() + " elements in set1");
        
        // Create set2
        Set<String> set2 = new java.util.HashSet<>();
        
        // Add strings to set2
        set2.add("London");
        set2.add("Shanghai");
        set2.add("Paris");
        System.out.print("\nset2 : " + set2);
        System.out.println(". There are " + set2.size() + " elements in set2");
        System.out.println("\nIs Taipei in set2? " + set2.contains("Taipei"));
        
        set1.addAll(set2);
        System.out.println("\nAfter adding set2 to set1, set1 is " + set1);
        
        set1.removeAll(set2);
        System.out.println("After removing set2 from set1, set1 is " + set1);
        
        set1.retainAll(set2);
        System.out.println("After removing common elements in set2 " 
                           + "from set1, set1 is " + set1);


        System.out.println("\n\nEXAMPLE 7: USING TREESETS");

        TreeSet<Student> students = new TreeSet<>(new StudentComparator());

        students.add(new Student(1, "Smith", "Alice", "Biology"));
        students.add(new Student(2, "Jackson", "Bob", "Mathematics"));
        students.add(new Student(3, "Smith", "Brian", "Chemistry"));
        students.add(new Student(4, "Adams", "Carol", "Computer Science"));

        Student s1 = new Student(5, "Adams", "Wednesday", "Engineering");
        Student s2 = new Student(5, "Jackson", "Percy", "Engineering");
        students.add(s2);
        students.add(s1);
        students.add(s2);   //try to add the same element 2x

        // Use the methods in SortedSet interface
        System.out.println("first(): " + students.first());
        System.out.println("last():  " + students.last());


        System.out.println("Students sorted by last name, then first name:\n");
        for (Student s : students) {
            System.out.println(s);
        }
        System.out.println("\nlower(Percy Jackson):      " + students.lower(s2));     //element < Percy
        System.out.println("higher(Percy Jackson):     " + students.higher(s2));    //element > Percy

        System.out.println("\nheadSet(Wednesday Adams):   " +  students.headSet(s1));
        System.out.println("headSet(Percy Jackson):     " + students.headSet(s2));   //all elements < Percy
        System.out.println("tailSet(Percy Jackson):     " + students.tailSet(s2));   //all elements >= Percy

        System.out.println("\npollFirst():                " + students.pollFirst());   //removes first element in the tree
        System.out.println("pollLast():                 " + students.pollLast());    //removes last element in the tree
        System.out.println("\nNew tree set:               " + students);
    }

    public static void example8Maps(){
        System.out.println("\n\nEXAMPLE 8: USING MAPS");

        Map<Integer, Student> studentMap = new TreeMap<>();
        Student s1 = new Student(1, "Adams", "Wednesday", "Engineering");
        Student s2 = new Student(2, "Jackson", "Percy", "Engineering");
        Student s3 = new Student(3, "Smith", "Alice", "Biology");
        Student s4 = new Student(4, "Jackson", "Bob", "Mathematics");
        Student s5 = new Student(5, "Smith", "Brian", "Chemistry");
        Student s6 = new Student(6, "Adams", "Carol", "Computer Science");

        studentMap.put(s4.getId(), s4);  
        studentMap.put(s3.getId(), s3);
        //studentMap.put(s5.getId(), s5);        
        studentMap.put(s1.getId(), s1);
        studentMap.put(s2.getId(), s2);             
        //studentMap.put(s6.getId(), s6);   
        //studentMap.put(s6.getId(), s6);    //try to add the same element 2x       
        
        System.out.println("\nStudent IDs added:  " + studentMap.keySet());     
        System.out.println("Student Map:        " + studentMap);
         
        // Use the methods in SortedSet interface
        System.out.println("\nStudents sorted by last name, then first name:");
        List<Student> sortedList = new ArrayList<>(studentMap.values());
        Collections.sort(sortedList, new StudentComparator());
        for (Student s : sortedList) {
            System.out.println(s);
        }

        System.out.println("\nGet (5):            " + studentMap.get(5));      
        System.out.println("Get (1):            " + studentMap.get(1));      
        System.out.println("Contains Key(9):    " + studentMap.containsKey(9));    
        System.out.println("Contains Key(3):    " + studentMap.containsKey(3));  
        System.out.println("Contains Value(s2): " + studentMap.containsValue(s2)); 
        System.out.println("Remove (4)          " + studentMap.remove(4));
        System.out.println("All IDs:            " + studentMap.keySet());    

        System.out.println("\nStudents after updates:");
        sortedList = new ArrayList<>(studentMap.values());
        Collections.sort(sortedList, new StudentComparator());
        for (Student s : sortedList) {
            System.out.println(s);
        }
    }
}