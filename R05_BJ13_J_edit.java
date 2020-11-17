private static final SomeType [] THE_THINGS = { ... };
public static final List<SomeType> SOMETHINGS =
  Collections.unmodifiableList(Arrays.asList(THE_THINGS));
