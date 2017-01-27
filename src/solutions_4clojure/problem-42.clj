;; 4Clojure Question 42
;;
;; Write a function which calculates factorials.
;;
;; Use M-x 4clojure-check-answers when you're done!

(= ((fn [x]
      (loop [total 1 cnt x]
        (if (= cnt 1)
          total
          (recur (* total cnt) (dec cnt))))) 1) 1)

(= ((fn [x]
      (loop [total 1 cnt x]
        (if (= cnt 1)
          total
          (recur (* total cnt) (dec cnt))))) 3) 6)

(= ((fn [x]
      (loop [total 1 cnt x]
        (if (= cnt 1)
          total
          (recur (* total cnt) (dec cnt))))) 5) 120)

(= ((fn [x]
      (loop [total 1 cnt x]
        (if (= cnt 1)
          total
          (recur (* total cnt) (dec cnt))))) 8) 40320)

