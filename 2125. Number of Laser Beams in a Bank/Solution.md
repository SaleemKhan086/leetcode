All the devices in a row will have laser beam connections with all the devices present in the next row with security devices.

So we ignore the rows with no security devices. The no. of laser beams between two rows having n1 and n2 devices will be equal to `n1*n2`

So we traverse the matrix and keep track of previously seen count of the devices in a row. whenver we find the new row with devices(`count>0`), we calculate the laser beams with the previously seen (`prev`) devices and add it to the answer. Now the current count becomes the `prev` for the upcoming rows.

Time Complexity: `O(n*m)`
Space Complexity: `O(1)`
