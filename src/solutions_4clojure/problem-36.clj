;; 4Clojure Question 36
;;
;; Can you bind x, y, and z so that these are all true?
;;
;; Use M-x 4clojure-check-answers when you're done!

(= 10 (let [x 7 y 3 z 1] (+ x y)))

(= 4 (let [x 7 y 3 z 1] (+ y z)))

(= 1 (let [x 7 y 3 z 1] z))
