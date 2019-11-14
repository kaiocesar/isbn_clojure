(ns isbn-clojure.core-test
  (:require [clojure.test :refer :all]
            [isbn-clojure.core :refer :all]
            [isbn-clojure.isbn_validate :as isbn_validate]))

(deftest validate-isbn
  (testing "Validate some valid isbn"
    (is (isbn_validate/validate_isbn "3598215088") false)))
