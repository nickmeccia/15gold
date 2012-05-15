(use 'joodo.env)

(def environment {
  :joodo.core.namespace "motion_comic.core"
  ; environment settings go here
  })

(swap! *env* merge environment)