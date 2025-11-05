char findTheDifference(char* s, char* t) {
    int len = strlen(s);
    int sum = 0;

    for (int i = 0; i <= len; i++)
        sum += t[i];

    for (int i = 0; i < len; i++)
        sum -= s[i];

    return sum;
}