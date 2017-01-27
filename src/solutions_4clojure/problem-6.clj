;; 4Clojure Question 6
;;
;; Vectors can be constructed several ways.  You can compare them with lists.
;;
;; <br/><br/><b>Note</b>: the brackets [] surrounding the blanks __ are part of the test case.
;;
;; Use M-x 4clojure-check-answers when you're done!

(= [:a :b :c] (list :a :b :c) (vec '(:a :b :c)) (vector :a :b :c))
