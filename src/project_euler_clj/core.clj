(ns project-euler-clj.core)

(defn problem1 []
  (->> (range 1000)
       (filter #(or (= 0 (rem % 3))
                    (= 0 (rem % 5))))
       (reduce +)))
