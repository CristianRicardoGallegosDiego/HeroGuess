# List Time Complexity

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

> [!NOTE]
> The complexity space is O(n).

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

> [!NOTE]
> The Complexity space is O(2n).

# Queue Time Complexity

## CircularQueue
| OPERATION | Best Case | Average Case | Worst Case |
|-----------|-----------|--------------|------------|
| enqueue   | O(1)      | O(1)         | O(1)       |
| dequeue   | O(1)      | O(1)         | O(1)       |
| peek      | O(1)      | O(1)         | O(1)       |
| pool      | O(1)      | O(1)         | O(1)       |
| isEmpty   | O(1)      | O(1)         | O(1)       |
| size      | O(1)      | O(1)         | O(1)       |

> [!NOTE]
> The complexity space is O(2n).

# Stack Time Complexity

## CircularStack
| OPERATION | Best Case | Average Case | Worst Case |
|-----------|-----------|--------------|------------|
| push      | O(1)      | O(1)         | O(1)       |
| pop       | O(1)      | O(1)         | O(1)       |
| peek      | O(1)      | O(1)         | O(1)       |
| isEmpty   | O(1)      | O(1)         | O(1)       |
| size      | O(1)      | O(1)         | O(1)       |

> [!NOTE]
> The complexity space is O(2n).