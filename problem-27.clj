;; 4Clojure Question 27
;;
;; Write a function which returns true if the given sequence is a palindrome.<br/><br>
;;
;; Hint: "racecar" does not equal '(\r \a \c \e \c \a \r)
;;
;; Use M-x 4clojure-check-answers when you're done!

(false? ((fn [x]
           (= (seq x) (reverse x)))
         '(1 2 3 4 5)))

(true? ((fn [x]
          (= (seq x) (reverse x))) "racecar"))

(true? ((fn [x]
          (= (seq x) (reverse x))) [:foo :bar :foo]))

(true? ((fn [x]
          (= (seq x) (reverse x))) '(1 1 3 3 1 1)))

(false? ((fn [x]
           (= (seq x) (reverse x))) '(:a :b :c)))
