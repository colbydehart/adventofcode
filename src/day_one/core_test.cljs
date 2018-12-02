(ns day-one.core-test
  (:require [cljs.test :refer-macros [deftest is testing run-tests]]
            [day-one.core]))


(deftest part-one-test
  (is (= 3 (day-one.core/part-one +1 +1 +1)))
  (is (= 0 (day-one.core/part-one +1 +1 -2)))
  (is (= -6 (day-one.core/part-one -1 -2 -3))))

(deftest part-two-test
  (is (= 0 (day-one.core/part-two 1 -1)))
  (is (= 10 (day-one.core/part-two 3 3 4 -2 -4)))
  (is (= 5 (day-one.core/part-two -6 3 8 5 -6)))
  (is (= 14 (day-one.core/part-two 7 7 -2 -7 -4))))


