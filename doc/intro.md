# Introduction to isbn-clojure

TODO: write [great documentation](http://jacobian.org/writing/what-to-write/)


isbn: 3-598-21508-8 de teste 


Let's take the ISBN-10 3-598-21508-8. We plug it in to the formula, and get:

(3 * 10 + 5 * 9 + 9 * 8 + 8 * 7 + 2 * 6 + 1 * 5 + 5 * 4 + 0 * 3 + 8 * 2 + 8 * 1) mod 11 == 0
Since the result is 0, this proves that our ISBN is valid.