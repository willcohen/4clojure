;; 4Clojure Question 24
;;
;; Write a function which returns the sum of a sequence of numbers.
;;
;; Use M-x 4clojure-check-answers when you're done!

(= (#(reduce + % ) [1 2 3]) 6)

(= (#(reduce + % ) (list 0 -2 5 5)) 8)

(= (#(reduce + % ) #{4 2 1}) 7)

(= (#(reduce + % ) '(0 0 -1)) -1)

(= (#(reduce + % ) '(1 10 3)) 14)
