# List Complexity Time

## SingleLinkedList
| OPERATION           | Best Case    | Average Case | Worst Case   |
|---------------------|--------------|--------------|--------------|
| add(element)        | O(1)         | O(n)         | O(n)         |
| add(index, element) | O(1)         | O(n)         | O(n)         |
| remove(index)       | O(1)         | O(n)         | O(n)         |
| get(index)          | O(1)         | O(n)         | O(n)         |
| contains(element)   | O(1)         | O(n)         | O(n)         |
| clear()             | O(1)         | O(1)         | O(1)         |
| size()              | O(1)         | O(1)         | O(1)         |
| isEmpty             | O(1)         | O(1)         | O(1)         |

## CircularLinkedList
| OPERATION           | Best Case  | Average Case                 | Worst Case                   |
|---------------------|------------|------------------------------|------------------------------|
| add(element)        | O(1)       | O(1)                         | O(1)                         |
| add(index, element) | O(1)       | O(<sup>n</sup>/<sub>2</sub>) | O(<sup>n</sup>/<sub>2</sub>) |
| remove(index)       | O(1)       | O(<sup>n</sup>/<sub>2</sub>) | O(<sup>n</sup>/<sub>2</sub>) |
| get(index)          | O(1)       | O(<sup>n</sup>/<sub>2</sub>) | O(<sup>n</sup>/<sub>2</sub>) |
| contains(element)   | O(1)       | O(<sup>n</sup>/<sub>2</sub>) | O(<sup>n</sup>/<sub>2</sub>) |
| clear()             | O(1)       | O(1)                         | O(1)                         |
| size()              | O(1)       | O(1)                         | O(1)                         |
| isEmpty             | O(1)       | O(1)                         | O(1)                         |