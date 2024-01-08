package com.leetcode.middle;

/**
 * @description:
 * @author: Linhuang
 * @date: 2024-01-03 15:00
 */
public class Trie_208 {

    private Trie_208[] children;

    private boolean isEnd;

    public Trie_208() {
        this.children = new Trie_208[26];
    }

    public void insert(String str) {
        Trie_208 node = this;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int index = ch - 'a';
            if(node.children[index] == null) {
                node.children[index] = new Trie_208();
            }
            node = node.children[index];
        }
        node.isEnd = true;
    }

    private boolean search(String word) {
        Trie_208 node = searchNode(word);
        return node != null && node.isEnd;
    }

    private boolean startsWith(String prefix) {
        return searchNode(prefix) != null;
    }

    private Trie_208 searchNode(String word) {
        Trie_208 node = this;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int index = ch - 'a';
            if(node.children[index] == null) {
               return null;
            }
            node = node.children[index];
        }
        return node;
    }


}