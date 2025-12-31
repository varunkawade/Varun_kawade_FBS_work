#include <stdio.h>
#include <string.h>
#include<stdlib.h>
typedef struct Player
{
    int jerseyNo;
    char name[20];
    int runs;
    int wickets;
    int matches;
} Player;

void addPlayer(Player **p, int *size);
void displayPlayers(Player *p, int size);
int searchPlayerByJerseyNo(Player *p, int size, int jersey);
int searchPlayerByName(Player *p, int size, char name[]);
void updatePlayer(Player *p, int size);
void deletePlayer(Player *p, int *size);
void sortByRuns(Player p[], int size, int order);
void sortByWickets(Player p[], int size, int order);
void top3Runs(Player p[], int size);
void top3Wickets(Player p[], int size);

int main()
{
    int size = 5;
    int choice;

    Player *p = (Player *)malloc(size * sizeof(Player));

    p[0].jerseyNo = 18;
    strcpy(p[0].name, "Virat");
    p[0].runs = 14255;
    p[0].wickets = 5;
    p[0].matches = 305;

    p[1].jerseyNo = 45;
    strcpy(p[1].name, "Rohit");
    p[1].runs = 11370;
    p[1].wickets = 9;
    p[1].matches = 276;

    p[2].jerseyNo = 7;
    strcpy(p[2].name, "Dhoni");
    p[2].runs = 10773;
    p[2].wickets = 1;
    p[2].matches = 350;

    p[3].jerseyNo = 10;
    strcpy(p[3].name, "Sachin");
    p[3].runs = 18426;
    p[3].wickets = 154;
    p[3].matches = 463;

    p[4].jerseyNo = 93;
    strcpy(p[4].name, "Jasprit");
    p[4].runs = 91;
    p[4].wickets = 149;
    p[4].matches = 89;

    while (1)
    {
        printf("\n--- Player Management System ---\n");
        printf("1. Add Player\n");
        printf("2. Search Player\n");
        printf("3. Update Player\n");
        printf("4. Delete Player\n");
        printf("5. Display All Player\n");
        printf("6. Sort by Runs\n");
        printf("7. Sort by Wickets\n");
        printf("8. Top 3 (Runs)\n");
        printf("9. Top 3 (Wickets)\n");
        printf("10. Exit\n");

        printf("Enter your choice: ");
        scanf("%d", &choice);

        if (choice == 1)
        {
            addPlayer(&p, &size);
        }
        else if (choice == 2)
        {
            int ch;
            printf("1. Search by Jersey No\n");
            printf("2. Search by Name\n");
            printf("Enter choice: ");
            scanf("%d", &ch);

            if (ch == 1)
            {
                int jerseyno;
                printf("Enter jersey number: ");
                scanf("%d", &jerseyno);

                int i = searchPlayerByJerseyNo(p, size, jerseyno);
                if (i != -1)
                {
                    printf("\nPlayer Found:\n");
                    printf("%d %s %d %d %d\n", p[i].jerseyNo, p[i].name, p[i].runs, p[i].wickets, p[i].matches);
                }
                else
                    printf("Player not found!\n");
            }
            else
            {
                char name[20];
                printf("Enter name: ");
                scanf("%s", name);

                int i = searchPlayerByName(p, size, name);
                if (i != -1)
                {
                    printf("\nPlayer Found:\n");
                    printf("%d %s %d %d %d\n", p[i].jerseyNo, p[i].name, p[i].runs, p[i].wickets, p[i].matches);
                }
                else
                    printf("Player not found!\n");
            }
        }
        else if (choice == 3)
        {
            updatePlayer(p, size);
        }
        else if (choice == 4)
        {
            deletePlayer(p, &size);
        }
        else if (choice == 5)
        {
            displayPlayers(p, size);
        }
        else if (choice == 6)
        {
            int order;
            printf("1 Ascending| 2 Descending:");
            scanf("%d", &order);
            sortByRuns(p, size, order);
            displayPlayers(p, size);
        }
        else if (choice == 7)
        {
            int order;
            printf("1 Ascending| 2 Descending:");
            scanf("%d", &order);
            sortByWickets(p, size, order);
            displayPlayers(p, size);
        }
        else if (choice == 8)
        {
            top3Runs(p, size);
        }
        else if (choice == 9)
        {
            top3Wickets(p, size);
        }

        else if (choice == 10)
        {
            break;
        }
        else
        {
            printf("Invalid choice!\n");
        }
    }
    free(p);

    return 0;
}

void addPlayer(Player **p, int *size)
{
    

     Player *temp = realloc(*p, (*size + 1) * sizeof(Player));
     if (temp == NULL)
    {
        printf("Memory allocation failed!\n");
        return;
    }
       *p=temp;
    printf("\nEnter JerseyNo, Name, Runs, Wickets, Matches: ");
    scanf("%d %s %d %d %d", &(*p)[*size].jerseyNo, (*p)[*size].name, &(*p)[*size].runs, &(*p)[*size].wickets, &(*p)[*size].matches);

    (*size)++;
    printf("Player added!\n");
}

void displayPlayers(Player *p, int size)
{
    if (size == 0)
    {
        printf("\nNo Players Available!\n");
        return;
    }

    printf("\nJersey\tName\tRuns\tWickets\tMatches\n");
    for (int i = 0; i < size; i++)
    {
        printf("%d\t%s\t%d\t%d\t%d\n", p[i].jerseyNo, p[i].name, p[i].runs, p[i].wickets, p[i].matches);
    }
}

int searchPlayerByJerseyNo(Player *p, int size, int jerseyno)
{
    for (int i = 0; i < size; i++)
    {
        if (p[i].jerseyNo == jerseyno)
            return i;
    }
    return -1;
}

int searchPlayerByName(Player *p, int size, char name[])
{
    for (int i = 0; i < size; i++)
    {
        if (strcmp(p[i].name, name) == 0)
            return i;
    }
    return -1;
}

void updatePlayer(Player *p, int size)
{
    int jerseyno;
    printf("Enter Jersey No to update: ");
    scanf("%d", &jerseyno);

    int i = searchPlayerByJerseyNo(p, size, jerseyno);
    if (i == -1)
    {
        printf("Player not found!\n");
        return;
    }

    printf("Enter new Runs, Wickets, Matches: ");
    scanf("%d %d %d", &p[i].runs, &p[i].wickets, &p[i].matches);

    printf("Player updated!\n");
}

void deletePlayer(Player *p, int *size)
{
    int jerseyno;
    printf("Enter Jersey No to delete: ");
    scanf("%d", &jerseyno);

    int index = searchPlayerByJerseyNo(p, *size, jerseyno);
    if (index == -1)
    {
        printf("Player not found!\n");
        return;
    }

    for (int i = index; i < *size - 1; i++)
    {
        p[i] = p[i + 1];
    }
    (*size)--;

    printf("Player deleted!\n");
}

void sortByRuns(Player p[], int size, int order)
{
    for (int i = 0; i < size - 1; i++)
    {
        for (int j = 0; j < size - 1 - i; j++)
        {
            if ((order == 1 && p[j].runs > p[j + 1].runs) || (order == 2 && p[j].runs < p[j + 1].runs))
            {
                Player temp = p[j];
                p[j] = p[j + 1];
                p[j + 1] = temp;
            }
        }
    }
}

void sortByWickets(Player p[], int size, int order)
{
    for (int i = 0; i < size - 1; i++)
    {
        for (int j = 0; j < size - 1 - i; j++)
        {
            if ((order == 1 && p[j].wickets > p[j + 1].wickets) || (order == 2 && p[j].wickets < p[j + 1].wickets))
            {
                Player temp = p[j];
                p[j] = p[j + 1];
                p[j + 1] = temp;
            }
        }
    }
}

void top3Runs(Player p[], int size)
{
    if (size < 3)
    {
        printf("Not enough players!\n");
        return;
    }

    sortByRuns(p, size, 2);
    printf("\nTop 3 Players by Runs:\n");
    for (int i = 0; i < 3; i++)
    {
        printf("%d\t%s\t%d runs\n", p[i].jerseyNo, p[i].name, p[i].runs);
    }
}

void top3Wickets(Player p[], int size)
{
    if (size < 3)
    {
        printf("Not enough players!\n");
        return;
    }

    sortByWickets(p, size, 2);
    printf("\nTop 3 Players by Wickets:\n");
    for (int i = 0; i < 3; i++)
    {
        printf("%d\t%s\t%d wickets\n", p[i].jerseyNo, p[i].name, p[i].wickets);
    }
}