package com.leetcode.middle;/**
 *
 * @description:
 * @author: Linhuang
 * @date: 2024-01-03 15:00
 */
public class Trie_208 {

    private Trie_208 [] children;
    private boolean isEnd;

    public Trie_208() {
        children = new Trie_208[26];
        isEnd = false;
    }

    public void insert(String word) {
        int len  = word.length();
        Trie_208 node = this;
        for(int i = 0 ; i < len;i++) {
            int index = word.charAt(i) - 'a';
            if(node.children[index] == null) {
                node.children[index] = new Trie_208();
            }
            node = node.children[index];
        }
        node.isEnd = true;
    }

    public boolean search(String word) {
        Trie_208 node = searchNode(word);
        return node != null && node.isEnd;
    }

    public boolean startsWith(String prefix) {
        return searchNode(prefix) != null;
    }

    public Trie_208 searchNode(String word) {
        int len  = word.length();
        Trie_208 node = this;
        for(int i = 0 ; i < len;i++) {
            int index = word.charAt(i) - 'a';
            if(node.children[index] == null) {
                return null;
            }
            node = node.children[index];
        }
         return node;
    }

}