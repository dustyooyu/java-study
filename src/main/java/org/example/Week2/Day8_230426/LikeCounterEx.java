package org.example.Week2.Day8_230426;

public class LikeCounterEx {
    public static void main(String[] args) {
        int likeCount = 0;
        likeCount = likeCount + 1; // 좋아요 한 개 받은 경우
        likeCount = likeCount + 1; // 좋아요 한 개 더 받은 경우
        likeCount = likeCount - 1; // 좋아요 한 개 취소된 경우
        System.out.printf("현재 좋아요 개수: " + likeCount);
    }
}
