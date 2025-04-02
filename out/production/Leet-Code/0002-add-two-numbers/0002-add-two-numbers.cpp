/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        ListNode* result = new ListNode;
        ListNode* to_return = new ListNode;
        int tmp = 0;
        int counter = 0;
        while(l1->next != nullptr and l2->next != nullptr) {
            counter++;
            tmp += (l1->val + l2->val);
            if(tmp >= 10) {
                result->val = tmp - 10;
                tmp = 1;
            }
            else {
                result->val = tmp;
                tmp = 0;
            }
            result->next = new ListNode;
            if(counter == 1) {
                to_return->val = result->val;
                to_return->next = result->next;
            }
            result = result->next;
            l1 = l1->next;
            l2 = l2->next;
        }

        tmp += (l1->val + l2->val);
        l1 = l1->next;
        l2 = l2->next;
        if(l1 == nullptr and l2 == nullptr) {
            counter++;
            if(tmp >= 10) {
                result->val = tmp - 10;
                result->next = new ListNode;
                if(counter == 1) {
                    to_return->val = result->val;
                    to_return->next = result->next;
                }
                result->next->val = 1;
                tmp = 1;
            }
            else {
                result->val = tmp;
                if(counter == 1)
                    to_return->val = result->val;
                tmp = 0;
            }
        }
        else {
            counter++;
            if(tmp >= 10) {
                result->val = tmp - 10;
                tmp = 1;
            }
            else {
                result->val = tmp;
                tmp = 0;
            }
            result->next = new ListNode;
            if(counter == 1) {
                to_return->val = result->val;
                to_return->next = result->next;
            }
            result = result->next;
            if(l1 != nullptr) {
                while(l1->next != nullptr) {
                    tmp += l1->val;
                    if(tmp >= 10) {
                        result->val = tmp - 10;
                        tmp = 1;
                    }
                    else {
                        result->val = tmp;
                        tmp = 0;
                    }
                    result->next = new ListNode;
                    result = result->next;
                    l1 = l1->next;
                }
                tmp += l1->val;
                if(tmp >= 10) {
                    result->val = tmp - 10;
                    result->next = new ListNode;
                    result->next->val = 1;
                }
                else
                    result->val = tmp;
            }
            else {
                while(l2->next != nullptr) {
                    tmp += l2->val;
                    if(tmp >= 10) {
                        result->val = tmp - 10;
                        tmp = 1;
                    }
                    else {
                        result->val = tmp;
                        tmp = 0;
                    }
                    result->next = new ListNode;
                    result = result->next;
                    l2 = l2->next;
                }
                tmp += l2->val;
                if(tmp >= 10) {
                    result->val = tmp - 10;
                    result->next = new ListNode;
                    result->next->val = 1;
                }
                else
                    result->val = tmp;
            }
        }
        return to_return;
    }
};