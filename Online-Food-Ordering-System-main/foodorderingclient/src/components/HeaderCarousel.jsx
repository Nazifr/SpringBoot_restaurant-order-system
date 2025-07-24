import 'react-responsive-carousel/lib/styles/carousel.min.css';
import { Carousel } from 'react-responsive-carousel';
import PizzaImg from '../assests/transparent-pizza.png';
import NoodlesImg from '../assests/noodles.png';
import RoastChickenImg from '../assests/chicken.png'

const carouselItems = [
    {
        id: 1,
        img: PizzaImg,
        title: 'Hot Pizza',
        description: 'Fresh out of the oven, our hot pizza is loaded with melted cheese, crispy pepperoni, and a golden crust that’s perfectly crunchy. One bite and you’ll be hooked!'
    },
    {
        id: 2,
        img: NoodlesImg,
        title: 'Delicious Noodles',
        description: 'Our noodles are stir-fried to perfection—steamy, saucy, and packed with bold flavors. Each bite is a warm, savory delight you won’t want to end.'
    },
    {
        id: 3,
        img: RoastChickenImg,
        title: 'Roast Chicken',
        description: 'Tender, juicy roast chicken with golden, crispy skin—seasoned just right and roasted to perfection. It’s comfort food at its finest.'
    },
]

const HeaderCarousel = () => {
    return (
        <Carousel
            showThumbs={false}
            infiniteLoop
            useKeyboardArrows
            autoPlay={true}
            showArrows={false}
            showStatus={false}
            showIndicators={false}
            interval={2000}
            className=' w-full h-[90vh] lg:px-[160px]'
        >
            {
                carouselItems.map(item => (
                    <div className="w-full h-[90vh] flex flex-col lg:flex-row justify-center items-center p-5 lg:p-0 lg:gap-5 bg-gray-100">
                        <div className="text-center lg:text-left mb-10 lg:mb-0">
                            <h3 className="text-2xl lg:text-4xl text-gray-700 mb-2 text-[#27AE60]">Special Dish</h3>
                            <h2 className="text-6xl lg:text-7xl text-red-600 font-bold mb-4">{item.title}</h2>
                            <p className="text-gray-600 lg:text-lg">{item.description}</p>
                        </div>
                        <div className=" md:w-[500px] lg:w-[800px] w-[90%]">
                            <img className="w-full h-full" src={item.img} alt="Delicious Noodles" />
                        </div>
                    </div>
                ))
            }
        </Carousel>
    )
}

export default HeaderCarousel