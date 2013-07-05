(ns project-euler-clj.core-test
  (:use clojure.test
        project-euler-clj.core))

(deftest problem1-test
  (is (= 233168 (problem1))))

(deftest problem2-test
  (is (= 4613732 (problem2))))
