;; 4Clojure Question 5
;;
;; <p>When operating on a list, the conj function will return a new list with one or more items "added" to the front.</p>
;;
;; <p>Note that there are two test cases, but you are expected to supply only one answer, which will cause all the tests to pass.</p>
;;
;; Use M-x 4clojure-check-answers when you're done!

(= '(1 2 3 4) (conj '(2 3 4) 1))

(= '(1 2 3 4) (conj '(3 4) 2 1))
