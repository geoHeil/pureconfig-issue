object Foo extends App {
  println("here")

  case class MyNestedThing(foo: String)

  case class XXX(
                  a: String,
                  b: String,
                  c: String,
                  d: String,
                  e: String,
                  f: String,
                  g: String,
                  h: String,
                  i: String,
                  j: String,
                  k: String,
                  l: String,
                  m: String,
                  n: String,
                  o: String,
                  p: String,
                  q: String,
                  r: String,
                  s: String,
                  t: String,
                  u: String,
                  v: String,
                  w: String,
                  x: String,
                  y: String,
                  z: String,
                  aa: String,
                  ab: String,
                  ac: String,
                  ad: String,
                  ae: String,
                  af: String,
                  ag: String,
                  ah: String,
                  ai: String,
                  aj: String,
                  ak: String,
                  al: String,
                  am: String,
                  an: String,
                  ao: String,
                  ap: String,
                  aq: String,
                  someLonglllllllllllllllllllllllllll: String,
                  so1meLonglllllllllllllllllllllllllll: String,
                  som2eLonglllllllllllllllllllllllllll: String,
                  ar: MyNestedThing,
                  as: MyNestedThing
                )

  pureconfig.ConfigReader[XXX]
}