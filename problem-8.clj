;; 4Clojure Question 8
;;
;; Sets are collections of unique values.
;;
;; Use M-x 4clojure-check-answers when you're done!

(= #{:a :b :c :d} (set '(:a :a :b :c :c :c :c :d :d)))

(= #{:a :b :c :d} (clojure.set/union #{:a :b :c} #{:b :c :d}))
