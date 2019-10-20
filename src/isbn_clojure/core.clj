(ns isbn-clojure.core
  (:require [isbn-clojure.isbn_validate :as isbn_validate]))

(defn -main []
  (isbn_validate/sayhello))
