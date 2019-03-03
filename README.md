# Strategy-and-Template-Method-design

A functional & flexible "table" application using Strategy and Template Method design patterns.


Part I: Strategy. Implement a generic Table<T> class using the Strategy design pattern. A Table<T>
contains a list of items of type T that correspond to each row of a table. The columns of the table are
different properties computed from the items, and designed by the user. The Table<T> class should be able to
print itself in the console in a tabular format.
  
Part II: Template Method. Rewrite your code to use the Template Method design pattern instead of
the Strategy.  
  
Example: 
For example, your table could contain items of a class Food with the following accessors;
getName(), getCarbs(), getFat(), and getProteins(). It should be possible to add the following two columns
to your table: Name and Calories. The Name column contains the value returned by getName(), and the
Calories column is computed from the following equation: cals = 4 * carbs + 9 * fat + 4 * proteins. 

