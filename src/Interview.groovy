class Interview {

    static void main(String[] args) {
        int[] numbers = new int[]{1, 3, 4, 5, 1, 5, 4}
        List<Integer> list = Arrays.stream(numbers).boxed().toList()
        Map<Integer, Integer> map = getIntegerIntegerMap(list)
        println map
    }

    private static Map<Integer, Integer> getIntegerIntegerMap(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>()
        for (Integer integer : list) {
            if (!map.containsKey(integer))
                map.put(integer, 1)
            else {
                map.put(integer, map.get(integer) + 1)
            }
        }

        map
    }
}
