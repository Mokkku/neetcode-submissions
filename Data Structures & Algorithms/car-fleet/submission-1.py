class Solution:
    def carFleet(self, target: int, position: List[int], speed: List[int]) -> int:
        cars = []
        headTime = -1;
        fleets = 0
        for i in range(0,len(position)):
            cars.append((position[i], speed[i]))
        cars = sorted(cars, reverse=True)
        for car in cars:
            if (headTime == -1):
                headTime = (target - car[0])/car[1]
            else:
                currentCarTime = (target - car[0])/car[1]
                if (currentCarTime <= headTime):
                    pass
                elif (currentCarTime > headTime):
                    fleets += 1
                    headTime = currentCarTime
        fleets += 1
        return fleets