(ns hello.assemble-paper
  (:require [e-paper.storage :as ep])
  (:import java.io.File))

(def dir (File. "/Users/hinsen/projects/e-paper/examples/hello/"))

(def paper (ep/create (File. dir "hello_paper.h5")))
(def hello-jar (ep/store-jar paper "hello"
                               (File. dir "code/hello.jar")))
(def prog (ep/store-program paper "run-hello" [hello-jar]
                            "HelloWorld" []))
(ep/close paper)
