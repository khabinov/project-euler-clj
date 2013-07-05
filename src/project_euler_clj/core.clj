(ns project-euler-clj.core)

(defn problem1 []
  (->> (range 1000)
       (filter #(or (= 0 (rem % 3))
                    (= 0 (rem % 5))))
       (reduce +)))

(defn fib [a b]
  (cons a (lazy-seq (fib b (+ b a)))))

(defn problem2 []
  (->> (fib 1 2)
       (take-while #(> 4000000 %))
       (filter even?)
       (reduce +)))
