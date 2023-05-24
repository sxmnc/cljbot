(defproject cljbot "0.1.0-SNAPSHOT"
  :description "A Discord bot for maniacs."
  :url "https://https://github.com/sxmnc/cljbot"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [org.suskalo/discljord "1.1.1"]]
  :repl-options {:init-ns cljbot.core}
  :main cljbot.core)
