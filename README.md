
consecutive-characters-processor处理一个输入的字符串，其中包含了连续的相同字符序列：

removeConsecutiveDuplicates：
这个方法的目标是从输入的字符串中移除连续的相同字符序列，直到没有连续的相同字符超过3个。它使用一个栈来追踪字符的出现，并根据字符是否连续来进行处理。如果连续字符的数量不超过3个，它会将这些字符重新放回栈中，否则会将它们移除。最后，它将栈中的字符连接成一个新的字符串，并返回这个新字符串作为结果。

replaceConsecutiveWithPrevious：
这个方法的目标是替换连续的相同字符序列。如果连续字符的数量不少于3个，它会用前一个字符的前一个字符（按照字母表顺序）来替换这些连续字符。如果连续字符的数量少于3个，它会保持这些字符不变。它也使用一个栈来追踪字符的出现，并根据字符是否连续进行处理。最后，它将栈中的字符连接成一个新的字符串，并返回这个新字符串作为结果。

