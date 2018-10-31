(ns sudoku.core-test
  (:require [clojure.test :refer :all]
            [sudoku.core :refer :all]))

(def b '[3 - - - - 5 - 1 -
         - 7 - - - 6 - 3 -
         1 - - - 9 - - - -
         7 - 8 - - - - 9 -
         9 - - 4 - 8 - - 2
         - 6 - - - - 5 - 1
         - - - - 4 - - - 6
         - 4 - 7 - - - 2 -
         - 2 - 6 - - - - 3])

(deftest test-row-for
  (testing "test gtting a row of a board."
    (is (= '(9 - - 4 - 8 - - 2) (row-for b 4 9)))))

(deftest test-col-for
  (testing "test gtting a col of a board."
    (is (= '(3 - 1 7 9 - - - -) (col-for b 0 9)))))

(deftest test-subgrid-for
  (testing "test getting a subgrid of a board."
    (is (= '(- - 6 - 2 - - - 3) (subgrid-for b 79)))))
